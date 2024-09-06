package com.ajwalker.jdbc_Eticaret.repository;

import java.sql.DriverManager;
import java.sql.*;
import static com.ajwalker.jdbc_Eticaret.utility.Constants.*;

public class DatabaseHelper {
	private Connection conn;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	private boolean openConnection(){
		try {
			DriverManager.getConnection("jdbc:postgresql://"+ DB_HOSTNAME+":"+DB_PORT+"/"+DB_NAME, DB_USERNAME, DB_PASSWORD);
			return true;
		}
		catch (SQLException e) {
			System.out.println("Bağlantı Hatası..."+e.getMessage());
			return false;
		}
	}
}