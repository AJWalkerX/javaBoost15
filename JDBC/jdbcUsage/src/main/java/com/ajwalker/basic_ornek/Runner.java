package com.ajwalker.basic_ornek;

import java.sql.*;

/*
* executeUpdate methodu ile silme, güncellme ve ekleme islemlerini yapabiliriz.
* executeQuery ile listeleme yapabiliriz.
* */
public class Runner {
	public static void main(String[] args) throws SQLException {
//		adressEkle(3,"Istanbul","Besiktas");
//		adressEkle(3,"İzmir","Bornova");
//		adresEkleV2(6, "Ankara", "Cankaya");
//		adresEkleV2(7, "Antalya", "Manavgat");
//		adresEkleV2(8, "Istanbul", "Sakarya");
//		adresSil(1001);
//		adresSil(1002);
		
//		adresGuncelle(1, "Muğla", "Marmaris");
	
		adresListele("Santa");
	}
	
	private static void adresListele(String il) {
		String sqlkomut = "SELECT * FROM public.tbladres WHERE il ILIKE ?;";
		String ConnectionString = "jdbc:postgresql://localhost:5432/ETicaret?user=postgres&password=root";

		try (Connection connection = DriverManager.getConnection(ConnectionString)) {
			PreparedStatement preparedStatement = connection.prepareStatement(sqlkomut);
			preparedStatement.setString(1, "%"+ il+"%");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int musteri_id = resultSet.getInt("musteri_id");
				String ilArg = resultSet.getString("il");
				String ilceArg = resultSet.getString("ilce");
				System.out.println(musteri_id + " " + ilArg + " " + ilceArg);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static void adressEkle(int musteri_id, String il, String ilce) throws SQLException {
		String sqlkomut =
				"INSERT INTO public.tbladres(musteri_id, il, ilce) VALUES " + "(" + musteri_id + ", '" + il + "', '" + ilce + "');";
		
		String ConnectionString = "jdbc:postgresql://localhost:5432/ETicaret";
		String username = "postgres";
		String password = "root";
		Connection connection = DriverManager.getConnection(ConnectionString, username, password);
		
		PreparedStatement preparedStatement = connection.prepareStatement(sqlkomut);
		int etkilenenSatirSayisi = preparedStatement.executeUpdate();
		if (etkilenenSatirSayisi > 0) {
			System.out.println("Eklendi");
		}
		else System.out.println("Eklenmedi");
		connection.close();
	}
	
	private static void adresEkleV2(int musteri_id, String il, String ilce) {
		String sqlkomut = "INSERT INTO public.tbladres(musteri_id, il, ilce) VALUES (?, ?, ?);";
		String ConnectionString = "jdbc:postgresql://localhost:5432/ETicaret";
		String username = "postgres";
		String password = "root";
		try (Connection connection = DriverManager.getConnection(ConnectionString, username, password)) {
			PreparedStatement preparedStatement = connection.prepareStatement(sqlkomut);
			preparedStatement.setInt(1, musteri_id);
			preparedStatement.setString(2, il);
			preparedStatement.setString(3, ilce);
			int etkilenenSatirSayisi = preparedStatement.executeUpdate();
			if (etkilenenSatirSayisi > 0) {
				System.out.println("Eklendi");
			}
			else System.out.println("Eklenmedi");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static void adresSil(int idArg) {
		String sqlkomut = "DELETE FROM public.tbladres WHERE id = ?;";
		String ConnectionString = "jdbc:postgresql://localhost:5432/ETicaret";
		String username = "postgres";
		String password = "root";
		
		try (Connection connection = DriverManager.getConnection(ConnectionString, username, password)) {
			PreparedStatement preparedStatement = connection.prepareStatement(sqlkomut);
			preparedStatement.setInt(1, idArg);
			int etkilenenSatirSayisi = preparedStatement.executeUpdate();
			if (etkilenenSatirSayisi > 0) {
				System.out.println("Silindi");
			}else System.out.println("Silinmedi");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static void adresGuncelle(int idArg, String yeniIl, String yeniIlce) {
		String sqlkomut = "UPDATE public.tbladres SET il = ?, ilce = ? WHERE id = ?;";
		String ConnectionString = "jdbc:postgresql://localhost:5432/ETicaret";
		String username = "postgres";
		String password = "root";
		
		try (Connection connection = DriverManager.getConnection(ConnectionString, username, password)) {
			PreparedStatement preparedStatement = connection.prepareStatement(sqlkomut);
			preparedStatement.setString(1, yeniIl);
			preparedStatement.setString(2, yeniIlce);
			preparedStatement.setInt(3, idArg);
			int etkilenenSatirSayisi = preparedStatement.executeUpdate();
			if (etkilenenSatirSayisi > 0) {
				System.out.println("Güncellendi");
			}else System.out.println("Güncellenmedi");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}