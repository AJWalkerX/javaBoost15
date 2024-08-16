import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//FOS ve FIS ile tüm dosya türleri üzerinde IO işlemleri yapılabilir.
//FileWritter ve FileReader ile sadece metin dosyaları ile çalışabilirsiniz.
public class FileWriterUsage {
	public static void main(String[] args) {
		dosyaYaz();
		dosyaYaz2();
		//Kullanıcıdan aldığımız metni dosyaya yazdıralım.
		scannerlaDosyayaYaz();
		scannerlaDosyayaYaz2();
		
	}
	
	private static void scannerlaDosyayaYaz2() {
		try(Scanner sc=new Scanner(System.in);
		    FileWriter fw=new FileWriter("dosya4.txt",true)){
			System.out.println("Bir metin giriniz:");
			String girdi="";
			StringBuilder sb=new StringBuilder();
			while(!(girdi=sc.nextLine()).equals("-1")){
				System.out.println("Bir metin giriniz:");
				sb.append(girdi+"\n");
			}
			fw.write(String.valueOf(sb));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void scannerlaDosyayaYaz() {
		try(Scanner sc=new Scanner(System.in);
		    FileWriter fw=new FileWriter("dosya3.txt",true)){
			//System.out.println("Bir metin giriniz:");
			String secim="";
			while(!secim.equals("-1")){
				System.out.println("Bir metin giriniz:");
				fw.write(secim+"\n");
				secim=sc.nextLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void dosyaYaz() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("dosya.txt");
			fw.write("Fenerbahçe");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void dosyaYaz2() {
		//try-with-resources: Kaynaklarla çalışan try
		try (FileWriter fw = new FileWriter("dosya2.txt")) {
			fw.write("Galatasaray");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}