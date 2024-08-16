package com.ajwalker.week02.degiskenler;

public class Operators {
	public static void main(String[] args) {
		long sonuc;
		sonuc = 5_000_000_000L + 3;
		
		double sonuc2;
		sonuc2 = 5.25 + 3;
		
		float sonuc3;
		sonuc3 = 5.25f + 3;
		
		//HATA 1:
		int i = 5;
		double d = 2.3;
		
		i = (int) (i + d); // ikili aritmetik operatör ile kullanılan değerlerden bir tanesi double ise sonuç
		// doubledır. O
		// yüzden bu sonucu int türünde bir değişkende saklayamayız. Bu sorun işlemin cast işlemine tabii tutulmasıyla
		// aşılabilir.
		
		System.out.println(i);
		
		//HATA 2:
		byte b1 = 8, b2 = 5, b3;
		
		b3 = (byte) (b1 + b2); // ikili aritmetik operatör ile kullanılan tam sayılarda işlem sonucu int olur.
		System.out.println(b3);
		
		//HATA 3:
		int y, z = 5;
		z = z + 2;
		y = z + 5;
		//z+2 // Bu şekilde atamasız bir işlem programda bulunmaz.
		
		z = 10;
		z += 5; // z= z+5
		System.out.println(z);
		
		z++; // z=z+1
		System.out.println(z);
		
		int j;
		i = 5;
		j = i++; // önce i'nin değeri j'ye akratırılır ardından i'nin değeri 1 artırılır.
		System.out.println("i: " + i + " j: " + j); // i:6 j:5
		
		int a, b;
		b = 5;
		a = ++b; // önce b'nin değerini 1 artır ardından b'nin değerini a'ya aktar.
		System.out.println("b: " + b + " a: " + a);
		
		
		// CTRL+ALT+L tuşu ile kodların hizamalamasını sağlayabilirsiniz.
		b = 10;
		++b;
		System.out.println(b);
		
		//Tekli Mantıksal Operatör: ! : mantıksal olarak tersini almaya yarar.
		boolean dogruMu = false;
		System.out.println(dogruMu); // false
		System.out.println(!dogruMu); // true
		
		if (!dogruMu) {
			System.out.println("dogruMu degeri Doğru iken çalışacak kodlar");
		}
		else {
			System.out.println("dogruMu degeri yanlış iken çalışacak kodlar");
		}
		System.out.println(dogruMu); //false
		dogruMu = !dogruMu;
		System.out.println(dogruMu); //true
		
		j = -5; // j'ye -5 değeri atandı.
		System.out.println(j);
		j -= 5; // j'ye j-5 değeri atandı.
		System.out.println(j);
		
		// Kıyaslama operatörleri geriye boolean sonuç dönerler. True veya False
		i = 5;
		j = 3;
		System.out.println(i < j); //false
		
		boolean deger;
		deger = i > j;
		System.out.println(deger);
		
		deger = i != j; // i' j'ye eşit değilse true döner.
		System.out.println(deger); //true yazdırdı.
		
		deger = i == j; // i j'ye eşit ise true döner.
		System.out.println(deger); // false yazdırdı.
		
		// Şart Operatörleri: & | && ||
		int m = 5, n = 10;
		int sayi = 12;
		
		boolean arasindaMi = (sayi > m) || (sayi < n);
		System.out.println(arasindaMi); // false
		
		// Tek 3 lü operatör: Ternary Operatör
		// (koşul) ? (doğruysa çalışacak kodlar) : (yanlışsa çalışacak kodlar)
		// short if
		i=30;
		j=20;
		
		int min=(i<j)?i:j;
		System.out.println(min);
		// ternary operatör ile kısaca yazılan kodun açık hali:
		if(i<j){
			min=i;
		}else{
			min=j;
		}
		//Eğer ternary operatör kullanıyorsanız sonucu bir değişkende tutmalısınız.
		//(i<j)?System.out.println(i):System.out.println(j); // HATA!!!
		
		// &, |, ^, ~, >>, <<, >>>,<<< BIT işlemleri için kullanılan operatörler.
		// 00 & 11 = 00
		
//		Operator OverLoading
		// Overload: Aşırı Yükleme : Birden fazla kullanım özelliği kazandırma.
		 sonuc=5+3;
		System.out.println(sonuc);
		
		System.out.println(10+20); // + operatörü sayılarla toplama işlemi yapar.
		
		System.out.println("Deneme"+10); // + operatörü eğer 1 tane string bile varsa birleştirme işlemi yapar.
		System.out.println("Deneme"+"İki"); // + operatörü eğer 1 tane string bile varsa birleştirme işlemi yapar.
		System.out.println(10+"İki"); // + operatörü eğer 1 tane string bile varsa birleştirme işlemi yapar.
		
		//System.out.println(true+10); // + operatörü booleanlarla kullanılamaz.
		 a=97;
		System.out.println(a); //a
		a++;
		System.out.println(a);
		System.out.println(a+2);
		System.out.println(a+1);
		for (char k = 0; k <255 ; k++) {
			System.out.println((int)k+"->"+k);
		}
		
		int harf=97;
		System.out.println((char)harf+" "+harf);
	}
}