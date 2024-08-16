package com.ajwalker.week03.Methods;
/*
	- Javada metodlar pass-by-value şeklinde çalışır.
	 primitive data type'lar parametre olarak kullanılırsa beklenildiği gibi gönderilen değişkenin değeri method
	 içindeki deişimden etkilenmez.
    - Complex(reference) data type'lar parametre olarak kullanılırsa göderilen nesnenin adresi metoda aktarılır. O
    yüzden method içinde yapılan değişim direkt olarak o nesne üzerinde de gerçekleştirilir.
*/
public class PassByValue {
	public static void main(String[] args) {
		int sayi = 10;
		artir(sayi);
		System.out.println("Sayi= " + sayi);
	
		Adet adetRef = new Adet();
		artirAdet(adetRef);
		System.out.println("AdetRef i degeri: "+ adetRef.i);
	}
	
	public static void artir(int i){
		i++;
		System.out.println("i= "+i);
	}
	public static void artirAdet(Adet adet){
		adet.i++;
		System.out.println("adet.i= " +adet.i);
	}
}

class Adet{
	int i= 5;
}