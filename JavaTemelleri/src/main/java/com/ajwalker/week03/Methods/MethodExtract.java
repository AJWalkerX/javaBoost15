package com.ajwalker.week03.Methods;

public class MethodExtract {
	public static void main(String[] args) {
		String deger = "BASLIK";
		extracted(deger);
		multiply(1,2,3,4); // bunu yazıp ALT+ENTER tuşuna basınca aşağıdaki method oluşturuldu.
	}
	
	private static void multiply(int i, int i1, int i2, int i3) {
	}
	
	//Method olmasını istediğin kodu seç ve çıkan pop-up seceneklerden extracted seçenegine tıkla ve çıkan seceneklerden methoda tıkla
	private static void extracted(String deger) {
		System.out.println("***********");
		System.out.println("******"+deger+"*****");
		System.out.println("***********");
	}
}