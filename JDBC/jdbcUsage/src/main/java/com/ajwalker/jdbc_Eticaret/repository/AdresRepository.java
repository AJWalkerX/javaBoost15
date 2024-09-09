package com.ajwalker.jdbc_Eticaret.repository;

import com.ajwalker.jdbc_Eticaret.entity.Adres;
import com.ajwalker.jdbc_Eticaret.entity.Musteri;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AdresRepository implements ICRUD<Adres>{
    private DatabaseHelper databaseHelper;
    private String sql;

    public AdresRepository() {
        this.databaseHelper = new DatabaseHelper();
    }

    @Override
    public void save(Adres adres) {
        sql = "INSERT INTO tbladres " +
                "(musteri_id,il,ilce,mahalle,adres) " +
                "VALUES ('%s','%s','%s','%s','%s')".
                        formatted(
                                adres.getMusteri_id(),
                                adres.getIl(),
                                adres.getIlce(),
                                adres.getMahalle(),
                                adres.getAdres());
        databaseHelper.executeUpdate(sql);
    }

    @Override
    public void delete(int id) {
        sql = "DELETE FROM tbladres WHERE id  = "+ id;
        databaseHelper.executeUpdate(sql);
    }

    @Override
    public void update(Adres adres) {
        sql = "UPDATE tblmusteriler SET il = %s, ilce = %s, mahalle = %s, adres = +%s WHERE id = %d".
                formatted(
                        adres.getIl(),
                        adres.getIlce(),
                        adres.getMahalle(),
                        adres.getAdres(),
                        adres.getId()
                );
        databaseHelper.executeUpdate(sql);
    }

    @Override
    public List<Adres> findAll() {
        sql = "SELECT * FROM tbladres ORDER BY id ASC";
        Optional<ResultSet> resultSet = databaseHelper.executeQuery(sql);
        List<Adres> adresList = new ArrayList<>();

        try {
            if (resultSet.isPresent()) {
                ResultSet rs = resultSet.get();
                while (rs.next()) {
                    adresList.add(getValueAdres(rs));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return adresList;
    }

    @Override
    public Optional<Adres> findById(int id) {
        sql = "SELECT * FROM tbladres WHERE id = " + id;
        Optional<ResultSet> resultSet = databaseHelper.executeQuery(sql);
        try {
            if (resultSet.isPresent()) {
                ResultSet rs = resultSet.get();
                if (rs.next()){
                    Adres adres = getValueAdres(rs);

                    return Optional.of(adres);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return Optional.empty();
    }

    private Adres getValueAdres(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        int musteriID = rs.getInt("musteri_id");
        String il = rs.getString("il");
        String ilce = rs.getString("ilce");
        String mahalle = rs.getString("mahalle");
        String adres = rs.getString("adres");
        int state = rs.getInt("state");
        Long createdAt = rs.getLong("createAt");
        Long updatedAt = rs.getLong("updateAt");
        Adres adresEntity = new Adres(id,musteriID,il,ilce,mahalle,adres);
        adresEntity.setState(state);
        adresEntity.setCreateat(createdAt);
        adresEntity.setUpdateat(updatedAt);
        return adresEntity;
    }
}