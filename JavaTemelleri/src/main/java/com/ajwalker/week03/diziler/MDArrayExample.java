package com.ajwalker.week03.diziler;

/*
       Sno     No         Ad       Not
       1       101        Ece      100
       2       102        Su       80
       3       103        Ali      70
       4       104        Can      40
    Bu yapı çok boyutlu dizide tutulabilir mi?
       */
public class MDArrayExample {
	public static void main(String[] args) {
		String sinifListesi[][] =
				{{"1", "101", "Ece", "100"},
						{"2", "102", "Su", "80"},
						{"3", "103", "Ali", "70"},
						{"4", "104", "Can", "40"}};
		//sinif listesini ekrana yazdırma:
		for (int i = 0; i < sinifListesi.length; i++) {
			for (int j = 0; j < sinifListesi[0].length; j++) {
				System.out.print(sinifListesi[i][j] + "\t\t");
			}
			System.out.println();
		}
		//sinif listesindeki ogrencilerin notlar toplamını ve ortalamasını bulun:
		System.out.print("\nNotlar: ");
		int toplam = 0, ortalama = 0;
		for (int j = 0; j < sinifListesi[0].length; j++) {
			System.out.print(sinifListesi[j][3] + "  ");
			toplam += Integer.parseInt(sinifListesi[j][3]);
		}
		System.out.println("\nToplam : "+toplam);
		ortalama = toplam/sinifListesi.length;
		System.out.println("Ortalama: "+ortalama);
	}
}