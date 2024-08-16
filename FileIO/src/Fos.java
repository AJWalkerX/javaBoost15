import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fos {
	public static void main(String[] args) {
		dosyaYaz("C:\\javaFiles\\belge.txt", "Alexander");
		dosyaYaz("belge.txt", "Şule");
	}
	
	private static void dosyaYaz(String filePath, String metin) {
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(filePath, true); //absolue path
			fos.write(metin.getBytes());
		}
		catch (FileNotFoundException e) {
			System.out.println("Fos dosyayı bulamadı.");
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("Fos yazma işleminde hata ile karşılaştı.");
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			}
			catch (IOException e) {
				System.out.println("Fos kapatmada bir hata ile karşılaşıldı.");
				e.printStackTrace();
			}
		}
	}
	
	private static void dosyaYazEski(String filePath, String metin) {
		File file = new File("belge.txt"); // relative path
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("C:\\javaFiles\\belge.txt", true); //absolue path
			fos.write(' ');
			fos.write('J');
			fos.write('A');
			fos.write('V');
			fos.write('A');
//			fos.write("dsada"); // -> String değer almaz
			
			//write(byte[] b) kullanımı
			byte[] byteArray = {' ', 'D', 'E','N','E','M','E', ' '};
			fos.write(byteArray);
			
			String sehir = "\nANKARA";
			byte[] sehirArr = new byte[sehir.length()];
			for (int i = 0; i< sehir.length(); i++){
				sehirArr[i] = (byte) sehir.charAt(i);
			}
			fos.write(sehirArr);
			
			String sehir2 = " IZMIR";
			fos.write(sehir2.getBytes());
			fos.write(" TRABZON".getBytes());
		}
		catch (FileNotFoundException e) {
			System.out.println("Fos dosyayı bulamadı.");
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("Fos yazma işleminde hata ile karşılaştı.");
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			}
			catch (IOException e) {
				System.out.println("Fos kapatmada bir hata ile karşılaşıldı.");
				e.printStackTrace();
			}
		}
	}
	
}