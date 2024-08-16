package com.ajwalker.stream_ornek;

import com.ajwalker.stream_usage.Personel;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OgrenciRunner {
	public static void main(String[] args) {
		List<Ogrenci> ogrenciler = new ArrayList<>();
		ogrenciler.add(new Ogrenci(1L,"Barış","Demirci","İstanbul","Bilg. Müh.",3.52));
		ogrenciler.add(new Ogrenci(2L,"Alexander J.","Walker","Eskişehir","Yön. Bil. Sistemleri",2.9));
		ogrenciler.add(new Ogrenci(3L,"Alperen","Bicav","Izmir","Hukuk",3.22));
		ogrenciler.add(new Ogrenci(4L,"Harun","SAKIN","Bursa","Bilg. Müh.",2.90));
		ogrenciler.add(new Ogrenci(5L,"Anıl","Özoğluoz","İstanbul","Bilg. Müh.",2.04));
		ogrenciler.add(new Ogrenci(6L, "Murat", "Sacak", "Kocaeli", "İnşaat Müh",2.60));
		ogrenciler.add(new Ogrenci(7L,"Berkay","Basol","Angara","Fotografcilik ve Kameramanlik Prog.",0.1));
		ogrenciler.add(new Ogrenci(8L,"Ahmet","Eris","İzmir","Matematik Böl.",2.52));
		ogrenciler.add(new Ogrenci(9L,"Mehmet","Tufan","Adana","Otomotiv müh.",3.08));
		ogrenciler.add(new Ogrenci(10L, "Emirhan", "Ergun", "Tekirdag", "Matematik", 2.8));
		ogrenciler.add(new Ogrenci(11L,"Mehmet","Ertop","Ankara","EEM",3.52));
		ogrenciler.add(new Ogrenci(12L,"Emine","Karabolat","Adana","Elektrik Elektronik Müh.",3.37));
		ogrenciler.add(new Ogrenci(13L,"Mehmet Can","Karahan","İstanbul","Elektronik Haberleşme",3.50));
		ogrenciler.add(new Ogrenci(14L,"Selin", "Sancak","Ankara","İnşaat Müh",3.18));
		ogrenciler.add(new Ogrenci(15L,"Özkan","Sargın","Kotor","Elektronik Haberleşme",3.0));
		ogrenciler.add(new Ogrenci(16L,"Alper","Güler","Ankara","İnşaat Müh",2.52));
		ogrenciler.add(new Ogrenci(17L,"Evrim","Çalışkan","Bursa","Bilg. Programcılığı",3.22));
		ogrenciler.add(new Ogrenci(18L,"Alperen","İkinci","Ankara","İnşaat Müh",3.02));
		
		//Soru1 : ögrencilerin tamamını yazdır.
		System.out.println("------------------- Soru 1 ----------------");
		ogrenciler.stream().forEach(System.out::println);
		//Soru2 : Notu 3.00 ve üstünde olan ogrenciler
		System.out.println();
		System.out.println("------------------- Soru 2 ----------------");
		ogrenciler.stream().filter(ogrenci -> ogrenci.getNot() >= 3.00).forEach(System.out::println);
		//Soru3 : İnşaat Müh de okuyan öğrencilerin sayısı kaçtır.
		System.out.println();
		System.out.println("------------------- Soru 3 ----------------");
		int size = ogrenciler.stream().filter(ogrenci -> ogrenci.getBolum().equals("İnşaat Müh")).toList().size();
		System.out.println(size);
		//Soru4 : Adı a ile başlıyan ogrenciler.
		System.out.println();
		System.out.println("------------------- Soru 4 ----------------");
		ogrenciler.stream().filter(ogrenci -> ogrenci.getAd().charAt(0) == 'A').forEach(System.out::println);
		
		//Soru5 : Hakan adlı ogrenci var mı.
		System.out.println();
		System.out.println("------------------- Soru 5 ----------------");
		boolean hakan = ogrenciler.stream().anyMatch(ogrenci -> ogrenci.getAd().equals("Hakan"));
		System.out.println(hakan);
		
		//Soru6: Öğrencilerin tamamını notlara göre büyükten küçüğe sıralayarak yazdırın.
		System.out.println();
		System.out.println("----------- Soru6: Öğrencilerin tamamını notlara göre büyükten küçüğe sıralayarak yazdırın. ----------- ");
		ogrenciler.stream().sorted(Comparator.comparing(Ogrenci::getNot).reversed()).forEach(System.out::println);
		
		//Soru7: Notu 3.00 üstü olan öğrencilerin adını ve bölümünü yazdırın.
		System.out.println();
		System.out.println("----------- Soru7: Notu 3.00 üstü olan öğrencilerin adını ve bölümünü yazdırın. ----------- ");
		ogrenciler.stream().filter(ogrenci -> ogrenci.getNot() > 3.00).map(ogrenci -> {
			return ogrenci.getAd() + " "+ ogrenci.getBolum();
		}).forEach(System.out::println);
		
		
		//Soru8: Elektronik Haberleşme bölümündeki öğrencilerin sayısını yazdırın.
		System.out.println();
		System.out.println("----------- Soru8: Elektronik Haberleşme bölümündeki öğrencilerin sayısını yazdırın. ----------- ");
		long count = ogrenciler.stream().filter(ogrenci -> ogrenci.getBolum().equals("Elektronik Haberleşme")).count();
		System.out.println(count);
		
		//Soru9: En yüksek nota sahip öğrencinin bilgilerini yazdırın.
		System.out.println();
		System.out.println("----------- Soru9: En yüksek nota sahip öğrencinin bilgilerini yazdırın. ----------- ");
		ogrenciler.stream().limit(1).forEach(System.out::println);
		
		//Soru10: Notu 2.50 ile 3.50 arasındaki öğrencilerin sayısını bulun.
		System.out.println();
		System.out.println("----------- Soru10: Notu 2.50 ile 3.50 arasındaki öğrencilerin sayısını bulun. ----------- ");
		long count1 =
				ogrenciler.stream().filter(ogrenci -> ogrenci.getNot() >= 2.50 && ogrenci.getNot() <= 3.50).count();
		System.out.println(count1);
		
		//Soru11: Bölümlere göre öğrencilerin not ortalamasını yazdırın.(grouplama) Collectors.grouping or groupingBy
		System.out.println();
		System.out.println("----------- Soru11: Bölümlere göre öğrencilerin not ortalamasını yazdırın.(grouplama) ----------- ");
		Map<String, Double> collect = ogrenciler.stream().collect(Collectors.groupingBy(
				Ogrenci::getBolum,
				Collectors.averagingDouble(Ogrenci::getNot)));
		collect.forEach((k,v)-> System.out.println(k +": "+ v));
		
		//Soru12: En düşük nota sahip öğrencinin bölümünü yazdırın.
		System.out.println();
		System.out.println("----------- Soru12: En düşük nota sahip öğrencinin bölümünü yazdırın. ----------- ");
		Optional<String> s = ogrenciler.stream()
		                               .min(Comparator.comparingDouble(Ogrenci::getNot))
		                               .map(Ogrenci::getBolum);
		System.out.println(s);
		
		//Soru13: Notların ortalaması kaçtır?
		System.out.println();
		System.out.println("----------- Soru13: Notların ortalaması kaçtır? ----------- ");
		List<Double> listNotlar = ogrenciler.stream().map(Ogrenci::getNot).toList();
		Optional<Double> summ = listNotlar.stream().reduce(Double::sum);
		System.out.println(summ.get()/listNotlar.size());
		//Soru14: Notu 2.50 altında kaç öğrenci vardır?
		System.out.println();
		System.out.println("----------- Soru14: Notu 2.50 altında kaç öğrenci vardır? ----------- ");
		long count2 = ogrenciler.stream().filter(ogrenci -> ogrenci.getNot() < 2.50).count();
		System.out.println(count2);
		
		//Soru15: Her bölümdeki öğrenci sayısı kaçtır? (grouplama)
		System.out.println();
		System.out.println("----------- Soru15: Her bölümdeki öğrenci sayısı kaçtır? (grouplama) ----------- ");
		Map<String, Long> collect1 =
				ogrenciler.stream().collect(Collectors.groupingBy(Ogrenci::getBolum, Collectors.counting()));
		collect1.forEach((k,v)-> System.out.println(k +": " +v));
		//Soru16: Adı en uzun olan öğrencinin adını yazdırın.
		System.out.println();
		System.out.println("----------- Soru16:  Adı en uzun olan öğrencinin adını yazdırın ----------- ");
		Optional<String> max = ogrenciler.stream().map(Ogrenci::getAd).max(Comparator.comparing(String::length));
		System.out.println(max);
	}
}