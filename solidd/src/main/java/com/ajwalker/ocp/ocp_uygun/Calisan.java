package com.ajwalker.ocp.ocp_uygun;

public class Calisan {
	//Çalışan ile ilgili ıvır zıvır
}
class OracleDatabase implements IDatabase{
	
	@Override
	public void add(Calisan calisan) {
	
	}
}
class MySqlDatabase implements IDatabase{
	
	@Override
	public void add(Calisan calisan) {
	
	}
}
class MongoDatabase implements IDatabase{
	@Override
	public void add(Calisan calisan) {
	
	}
}
//Bu yeni eklenen database
class MsSqlDatabase implements IDatabase{
	
	@Override
	public void add(Calisan calisan) {
	
	}
}
//Değişim yok ama gelişim var
class CalisanManager{
	public void calisanEkle(IDatabase database, Calisan calisan){
		database.add(calisan);
	}
}