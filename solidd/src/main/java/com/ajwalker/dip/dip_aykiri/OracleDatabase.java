package com.ajwalker.dip.dip_aykiri;

import com.ajwalker.dip.dip_uygun.IDatabase;

public class OracleDatabase implements IDatabase {
	public void add(Object o){
		System.out.println("Object veritabanına eklendi.");
	}
}
class MySqlDatabase implements  IDatabase{
	public void add(Object o){
		System.out.println("Object veritabanına eklendi.");
	}
}
class HataRaporlama{
	private IDatabase database;
	
	public HataRaporlama(IDatabase db){
		this.database = db;
	}
	public void hataRaporlama(Exception exception){
		database.add(exception);
	}
}