package com.ajwalker;
/*
Tarih-zaman bilgisi programlarda nerelerde kullanılabilir?
-Yapılan işlemlerin zaman kaydı
-Rezervasyon işlemleri
-Doğum günü ile yaş hesaplama
-Kullanıcıların doğum tarihi
-Hangi kullanıcı hangi işlemi ne zaman gerçekleştirdi
-Programın çalışma süresi
-Hata oluşma anı

Unix Epoch Time: 1.1.1970 00:00:00.0000 zamanı başlangıç kabul eden bir sistem. Zone bilgisi yok.
1 000 000 000 ns = 1sn
1 000         ms = 1sn
60            sn = 1dk
60            dk = 1sa
24            sa = 1g
Long veri tipi tutulur.
Long veri tipinde zaman bilgisi tutmak daha az yer kaplar
Hesaplama işlemlerinde çok daha efektif sonuç alabiliriz.
*/
public class EpochTime {
	public static void main(String[] args) {
		System.out.println("şu anki zaman: "+ System.currentTimeMillis());
		//https://www.epochconverter.com/
	}
}