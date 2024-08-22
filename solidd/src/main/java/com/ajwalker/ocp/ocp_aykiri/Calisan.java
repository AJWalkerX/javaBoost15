package com.ajwalker.ocp.ocp_aykiri;

public class Calisan {
	//Çalışan ile ilgili ıvır zıvır
}
class OracleDatabase{
	public void ekle(Calisan calisan){
	
	}
	
}
class MySqlDatabase{
	public void ekle(Calisan calisan){
	
	}
	
}
class MongoDatabase{
	public void ekle(Calisan calisan){
	
	}
	
}
//Bu yeni eklenen database
class MsSqlDatabase{
	public void ekle(Calisan calisan){
	
	}
	
}
class CalisanManager{
	public void calisanEkle(Object database, Calisan calisan){
		if (database instanceof OracleDatabase){
			((OracleDatabase) database).ekle(calisan);
		}
		else if (database instanceof MySqlDatabase){
			((MySqlDatabase) database).ekle(calisan);
		}
		else if (database instanceof MongoDatabase){
			((MongoDatabase) database).ekle(calisan);
		}
		//Buraya MsSql'i eklemek değişim olur!
		//!OCP'ye uygun değil
	}
}