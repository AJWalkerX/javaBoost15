package com.ajwalker.week02.strings;
/*
String immutable bir sınıftır. Her değişiklik sonrası yeni nesne oluşur.
StringBuilder sınıfı mutable bir sınıftır. : Yapılan değişikler ilgili nesnede yapılır. Yeni nesne oluşmaz.
StringBuffer sınıfı mutable bir sınıftır. Multithread uygulamalarda kullanılabilir.
 */
public class StringBuilderUsage {
	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder(); //boş bir string builder nesnesi ürettik.
		sb1.append("Java15");
		System.out.println(sb1);
		System.out.println(sb1.replace(4,6,"2500")); //sb1=Java2 StringBuilder Öğreniyor.500
		System.out.println(sb1.insert(5," StringBuilder Öğreniyor."));
		System.out.println(sb1);
		System.out.println(sb1.delete(5,10));
		
		
	}
}