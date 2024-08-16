import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Fis {
	public static void main(String[] args) {
		
		dosyaOku("C:\\javaFiles\\belge.txt", 4,11);
		System.out.println("--------------");
		dosyaOku("belge.txt");
	}
	
	private static void dosyaOku(String dosyaYolu) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(dosyaYolu);
//			char read =(char) fis.read();
//			System.out.print(read);
//			read =(char) fis.read();
//			System.out.print(read);
//			read =(char) fis.read();
//			System.out.print(read);
//			read =(char) fis.read();
//			System.out.print(read);
			
			int okunanKarakter;
			String metin = "";
			while ((okunanKarakter=fis.read()) != -1){
				metin+=(char)okunanKarakter;
			}
			System.out.println(metin);
		}
		catch (FileNotFoundException e) {
			System.out.println("Okunacak dosya bulunamadı!");
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("fis read methodunda hata oluştu!");
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void dosyaOku(String dosyaYolu, int baslangic, int okunacakKarakterSayisi) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(dosyaYolu);
			fis.skip(baslangic);
			int okunanKarakter;
			String metin = "";
			int  sayac = 0;
			while ((okunanKarakter=fis.read()) != -1){
				metin+=(char)okunanKarakter;
				sayac++;
				if (sayac == okunacakKarakterSayisi){
					break;
				}
			}
			System.out.println(metin);
		}
		catch (FileNotFoundException e) {
			System.out.println("Okunacak dosya bulunamadı!");
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("fis read methodunda hata oluştu!");
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}