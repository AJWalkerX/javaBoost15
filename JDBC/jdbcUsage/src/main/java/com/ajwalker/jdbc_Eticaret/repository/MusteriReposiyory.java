package com.ajwalker.jdbc_Eticaret.repository;

import com.ajwalker.jdbc_Eticaret.entity.Musteri;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MusteriReposiyory implements ICRUD<Musteri> {

    private DatabaseHelper databaseHelper;
    private String sql;

    public MusteriReposiyory() {
        this.databaseHelper = new DatabaseHelper();
    }
    @Override
    public void save(Musteri musteri) {
        sql = "INSERT INTO tblmusteriler " +
                "(ad,soyad,cinsiyet,dtarih,email,tel,sehir) " +
                "VALUES ('%s','%s','%s','%s','%s','%s','%s')".
                        formatted(
                                musteri.getAd(),
                                musteri.getSoyad(),
                                musteri.getCinsiyet(),
                                musteri.getDtarih(),
                                musteri.getEmail(),
                                musteri.getTel(),
                                musteri.getSehir());
        databaseHelper.executeUpdate(sql);
    }
    @Override
    public void update(Musteri musteri) {
        sql = "UPDATE tblmusteriler SET ad = %s, soyad = %s, cinsiyet = %s, dtarih = +%s, email = %s, tel = %s, sehir = %s WHERE id = %d".
                formatted(
                        musteri.getAd(),
                        musteri.getSoyad(),
                        musteri.getCinsiyet(),
                        musteri.getDtarih(),
                        musteri.getEmail(),
                        musteri.getTel(),
                        musteri.getSehir(),
                        musteri.getId()
                );
        databaseHelper.executeUpdate(sql);
    }
    @Override
    public void delete(int silinecekMusteriID) {
        sql = "DELETE FROM tblmusteriler WHERE id  = "+ silinecekMusteriID;
        databaseHelper.executeUpdate(sql);
    }

    @Override
    public List<Musteri> findAll() {
        sql = "SELECT * FROM tblmusteriler ORDER BY id ASC";
        Optional<ResultSet> resultSet = databaseHelper.executeQuery(sql);
        List<Musteri> musteriList = new ArrayList<>();

        try {
            if (resultSet.isPresent()) {
                ResultSet rs = resultSet.get();
                while (rs.next()) {
                    musteriList.add(getValueMusteri(rs));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return musteriList;
    }

    @Override
    public Optional<Musteri> findById(int id) {
        sql = "SELECT * FROM tblmusteriler WHERE id = " + id;
        Optional<ResultSet> resultSet = databaseHelper.executeQuery(sql);
        try {
            if (resultSet.isPresent()) {
                ResultSet rs = resultSet.get();
                if (rs.next()){
                    Musteri musteri = getValueMusteri(rs);

                    return Optional.of(musteri);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return Optional.empty();
    }

    private Musteri getValueMusteri(ResultSet rs) throws SQLException {
        int id;
        id = rs.getInt("id");
        String ad = rs.getString("ad");
        String soyad = rs.getString("soyad");
        String cinsiyet = rs.getString("cinsiyet");
        String dtarih = rs.getString("dtarih");
        String email = rs.getString("email");
        String tel = rs.getString("tel");
        String sehir = rs.getString("sehir");
        int state = rs.getInt("state");
        Long createdAt = rs.getLong("createAt");
        Long updatedAt = rs.getLong("updateAt");
        Musteri musteri = new Musteri(id,ad,soyad,cinsiyet, LocalDate.parse(dtarih),tel,email,sehir);
        musteri.setState(state);
        musteri.setCreateat(createdAt);
        musteri.setUpdateat(updatedAt);
        return musteri;
    }

}