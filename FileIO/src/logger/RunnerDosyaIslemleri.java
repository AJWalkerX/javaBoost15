package logger;

import java.util.ArrayList;

public class RunnerDosyaIslemleri {
	public static void main(String[] args) {
		Log log1 = new Log("Hata mesajı", "Classname1", "MethodName1","Açıklam1",System.currentTimeMillis());
		Log log2 = new Log("Hata mesajı", "Classname2", "MethodName2","Açıklam2",System.currentTimeMillis());
		Log log3 = new Log("Hata mesajı", "Classname3", "MethodName3","Açıklam3",System.currentTimeMillis());
		
		DosyaIslemleri<Log> logDosyaIslemleri = new DosyaIslemleri<>();
		logDosyaIslemleri.writeToBin(log1,"loglar.bin");
		logDosyaIslemleri.writeToBin(log2,"loglar.bin");
		logDosyaIslemleri.writeToBin(log3,"loglar.bin");
		
		ArrayList<Log> logs = logDosyaIslemleri.readFromBin("loglar.bin");
		logs.forEach(System.out::println);
		
		Ogrenci ogr1=new Ogrenci("Eda", 101L);
		Ogrenci ogr2=new Ogrenci("Ahmet", 102L);
		Ogrenci ogr3=new Ogrenci("Selim", 103L);
		
		System.out.println();
		DosyaIslemleri<Ogrenci> ogrenciDosyaIslemleri=new DosyaIslemleri<>();
		ogrenciDosyaIslemleri.writeToBin(ogr1,"ogrler.bin");
		ogrenciDosyaIslemleri.writeToBin(ogr2,"ogrler.bin");
		ogrenciDosyaIslemleri.writeToBin(ogr3,"ogrler.bin");
		ArrayList<Ogrenci> ogrencilerArrayList = ogrenciDosyaIslemleri.readFromBin("ogrler.bin");
		ogrencilerArrayList.forEach(System.out::println);
	}
}