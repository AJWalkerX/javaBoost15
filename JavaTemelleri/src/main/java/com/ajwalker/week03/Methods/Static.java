package com.ajwalker.week03.Methods;

public class Static {
	//Stream degiskenler
	int sayi1 = 10; //non-static field
	static  int sayi2; //static field
	
	public void selam(){ //non-static method
		System.out.println("Selam");
	}
	public static void hi(){ //static method
		System.out.println("hi");
	}
}
class DenemeStatic{
	public static void main(String[] args) {
		Static obj = new Static();
//		obj.sayi2 -> Erişilebilir fakat kullanımı doğru değil
		System.out.println(obj.sayi1);
		System.out.println(Static.sayi2); // Sadece sınıf üzerinden ulaşılabilir.
		
		obj.selam(); //Static.selam(); olmaz
		Static.hi();
//		obj.hi(); -> Erişilebilir fakat kullanımı doğru değil
	}
}