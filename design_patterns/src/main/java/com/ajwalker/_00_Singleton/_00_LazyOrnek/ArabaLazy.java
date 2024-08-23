package com.ajwalker._00_Singleton._00_LazyOrnek;

public class ArabaLazy {
	// Dışarıdan erişelemeyecek
	// Sınıfa bağlı ve adresi değişmeyecek.
	// ilk değeri null olan.
	// Araba tipinde
	// instance adında bir sınıf değişkeni oluşturduk:
	private static ArabaLazy instance;
	String marka;
	
	private ArabaLazy(String marka) {
		System.out.println("Araba constructor çalıştı.");
		this.marka = marka;
	}
	
	
	public static ArabaLazy getInstance(String marka) {
		// Eğer instance null ise yeni bir araba nesnesi üretir.
		if(instance==null) {
			instance=new ArabaLazy(marka); //Bu sadece 1 kere çalışır.
		}
		return instance;
	}
	// Urun u1=new Urun(101,"Kalem",50);
	// db.save(u1);
	
	
	public String getMarka() {
		return marka;
	}
	
	public void setMarka(String marka) {
		this.marka = marka;
	}
}