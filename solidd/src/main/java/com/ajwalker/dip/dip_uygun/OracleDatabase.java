package com.ajwalker.dip.dip_uygun;

public class OracleDatabase {
	public void add(Object o){
		System.out.println("Object veritabanına eklendi.");
	}
}
class MySqlDatabase {
	public void add(Object o){
		System.out.println("Object veritabanına eklendi.");
	}
}
class HataRaporlama{
	private OracleDatabase oracleDatabase;
	
	public HataRaporlama(){
		this.oracleDatabase = new OracleDatabase();
	}
	public void hataRaporlama(Exception exception){
		oracleDatabase.add(exception);
	}
}