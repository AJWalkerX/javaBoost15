package com.ajwalker.week02.strings;

public class StringClasses {
	public static void main(String[] args) {
		//String sınıfından constructor ile nesne oluşturma
		String ad = new String("Barış");
		String ad1 = new String("Barış");
		// " " ile String nesnesi oluşturma:
		String soyad = "Demirci";
		String soyad1 = "Demirci";
		//String sınıfı final keywordlü bir sınıftır. Final keywordü eğer sınıflarda kullanılırsa, o sınıftan miras
		// alınamaz.
		//String sınıfı; java.io.Serializable, Comparable<String>, CharSequence, Constable, ConstantDesc
		// interfacelerinden implemente almıştır.
		
		// Mutable X Immutable
		// String sınıfı immutable bir sınıftır. Değiştirilemez demektir.
		soyad += " R.";
		
		/*
		- StringBuilder mutable özelliği taşır fakat String immutable'dır.
		- Mutable özelliği yeni nesleler oluşturmadan değişiklikleri sağlar.
		- Fakat String her seferinde değişiklik esnasında yeni nesne oluşturur. Yani değiştirilemez.
		*/
		System.out.println("StringBuilder islemleri: ");
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("Alexander J. Walker");
		System.out.println(strBuilder);
		System.out.println(strBuilder.replace(0,12, "Joseph"));
		System.out.println(strBuilder.insert(13," Awesome"));
		System.out.println(strBuilder.delete(0,14));
	}
}