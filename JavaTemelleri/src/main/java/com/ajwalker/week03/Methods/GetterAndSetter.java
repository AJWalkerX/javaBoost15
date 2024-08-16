package com.ajwalker.week03.Methods;

public class GetterAndSetter {
	public String ad;
	public String soyad;
	private String nickName; // Sadece bu clasttan erişilebilir.
	
	public String getNickName() {
		return nickName;
	}
	
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
}

class IsimAl{
	public static void main(String[] args) {
		//Sınıftan bir nesne oluşturma:
		GetterAndSetter obj = new GetterAndSetter();
		//obj.nickName private olduğu için erişilemez
		obj.ad = "Alexander";
		obj.soyad = "Walker";
		
		//Sınıftan bir nesne oluşturma:
		GetterAndSetter calisan = new GetterAndSetter();
		//obj.nickName private olduğu için erişilemez
		calisan.ad = "Ahmet";
		calisan.soyad = "Sanci";
		
		System.out.println(obj.ad);
		System.out.println(obj.soyad);
		System.out.println(calisan.ad);
		System.out.println(calisan.soyad);
		calisan.setNickName("Alex");
		System.out.println(calisan.getNickName());
		calisan.setNickName("Happy");
		System.out.println(calisan.getNickName());
	}
}