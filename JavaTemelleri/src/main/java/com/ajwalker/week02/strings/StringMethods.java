package com.ajwalker.week02.strings;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.Locale;

public class StringMethods {
	public static void main(String[] args) {
		String str = "Alexander J. Walker";
		
		//		Girilen String değerin son karakterini alma.
		System.out.println(str.charAt(str.length() - 1));
		
		//concat(); += işlemi ile aynı.
		System.out.println("\nconcat(); islemleri:");
		System.out.println(".concat(...): "+str.concat(" AKA: Happy"));
		str = "Alexander J. Walker";
		System.out.println("+= ile atama: " +(str +=" AKA: Happy" ));
		
		// indexOf();
		System.out.println("\nindexOf(); islemleri:");
		str = "Alexander J. Walker";
		
		System.out.println(".indexOf(a): "+str.indexOf('a'));
		//Aranan karakter bulunamazsa -1 değerini döner.
		System.out.println(".indexOf(i): "+str.indexOf('i'));
		//İlk karşılaştığı index değerini döner.
		System.out.println(".indexOf(alex): "+str.indexOf("lex"));
		
		// İkinci e degerini bulma
		int ilkIndex = str.indexOf('e');
		System.out.println("Ilk e index degeri: "+ ilkIndex);
		int ikinciIndex = str.indexOf('e',ilkIndex+1);
		System.out.println("Ikinci e index degeri: "+ ikinciIndex);
		
		//lastIndexOf(); -> Sondan başlayarak arama yapar ilk e degeri 2 son e degeri ise 17
		System.out.println("lastIndexOf: "+ str.lastIndexOf('e'));
		
		//compareTo(); -> Eğer ilk karakterler aynı ise sonraki karakterler arasında kaşılaştırma yapar. Eğer her iki
		// String de aynı ise 0 degerini doner.
		System.out.println("\ncompareTo(); islemleri:");
		str = "Alexander"; //A = 65;
		String str2 = "Joseph"; //J = 74
		System.out.println(str.compareTo(str2)); //65 -74 = -9
		//Buyuk küçük harfleri yok sayiyor. -> compareToIgnoreCase
		str2 = "joseph";
		System.out.println(str.compareToIgnoreCase(str2));
		System.out.println(str.compareTo(str2));
		
		//toUpperCase();
		System.out.println("\ntoUpperCase(); islemleri:");
		str = "istanbul";
		System.out.println(str.toUpperCase()); // Eğer tr işletim ise ingilizcede büyük İ yok onun için locale tanımı
		// yapılması gerekli
//		Locale eng = new Locale("en", "US");
//		System.out.println(str.toUpperCase(eng));
		// yada :
		Locale tr = new Locale("tr", "TR");
		System.out.println(str.toUpperCase(tr));
		
		// trim(); -> baştaki ve sondaki white spaceleri siler
		System.out.println("\ntrim(); islemleri:");
		str = " Alexande r J. Walker   ";
		System.out.println(str.trim());
		
		//replace(); -> istenilen karakterler değiştirilir. 'a'ları 'o' yaptım String de olabilir bu işlem
		System.out.println("\nreplace(); islemleri:");
		str = str.trim().toLowerCase().replace( 'a', 'o');
		System.out.println(str);
		
		//contains(); -> içerisinde var mı ? boolean deger doner
		System.out.println("\ncontains(); islemleri:");
		str = "Alexander J. Walker";
		System.out.println(str.contains("Alex"));
		System.out.println(str.contains("alex"));
		System.out.println(str.contains("b"));
		
		//startWith, endsWith
		System.out.println("\nstartWith(); islemleri:");
		System.out.println(str.startsWith("Alex"));
		System.out.println(str.startsWith("alex"));
		System.out.println(str.startsWith("A"));
		System.out.println("\nendsWith(); islemleri:");
		System.out.println(str.endsWith("Walker"));
		System.out.println(str.endsWith("walker"));
		
		//Escape Characters:
		System.out.println("Bugun \"Ankara'da\" hava yagmurlu");
		System.out.println("\t"); //tab tuşuna basma işlemi yapar.
	}
}