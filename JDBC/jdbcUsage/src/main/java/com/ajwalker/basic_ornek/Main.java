package com.ajwalker.basic_ornek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
* VERİTABINI DRIVER
* Bir programlama dili ile bir veritabanı arasında iletişim kurmayı sağlayan yazılım veya bileşendir.
* Vt Driver ile:
* Vt sunucusuna bağlantı kurabiliriz.
* Veritabanına komut gönderebiliriz.
* Sorgular yazabiliriz.
* Geri dönen değerleri alabiliriz.
*
* Her bir veritabanı üreticisi farklı programlama dilleri için driverlar üretilir.
*
* PostgreSQL Java Driverını indirmemiz gerekli.
* Bunun için mvnrepository.com adresinden PostgreSQL JDBC Driverı indirilir.
* Kaynak kodları: https://mvnrepository.com/artifact/org.postgresql/postgresql
* build.gradle dosyasında
* implementation group: 'org.postgresql', name: 'postgresql', version: '42.3.1'
* içerisine bu şekilde driver kaydedilir.
*/
public class Main {
	public static void main(String[] args) throws SQLException {
		//JDBC kullanmak için ilk yapmamız gereken DRIVER'ı devreye alırız.
		//Java 1.6 ve öncesi: Class.forName("org.postgresql.Driver");
		
		/*
		- Javadan posgresql server'a geçip bağlantı kurmak için gerekli olanlar:
		- hostname: localhost
		- port: 5432
		- username: postgres
		- password: root
		- database: ETicaret
		- url: jdbc:postgresql://localhost:5432/ETicaret
		
		//ConnectionString - Bağlantı oluşturma
		*/
		String ConnectionString = "jdbc:postgresql://localhost:5432/ETicaret";
		String username = "postgres";
		String password = "root";
		
		Connection connection = DriverManager.getConnection(ConnectionString, username, password);
		//String bir ifade  içinde basit bir sorgu oluşturmak için:
		String sqlkomut ="INSERT INTO public.tbladres(musteri_id, il, ilce)VALUES (1, 'London', 'Soho');";
		
		PreparedStatement preparedStatement = connection.prepareStatement(sqlkomut);
		preparedStatement.executeUpdate();
		connection.close();
	}
}