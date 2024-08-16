import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderUsage {
	public static void main(String[] args) {
		tekSatirOkuma();
		System.out.println("----------------------------");
		dosyaninTamaminiOkuma();
	}
	
	private static void dosyaninTamaminiOkuma() {
		try(BufferedReader reader = new BufferedReader(new FileReader("takımlar"))){
			String okunanSatir;
			int sayac = 1;
			while ((okunanSatir = reader.readLine()) != null){
				System.out.println((sayac++) + "- " + okunanSatir);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void tekSatirOkuma() {
		try(BufferedReader reader = new BufferedReader(new FileReader("takımlar"))){
			String okunanSatir = reader.readLine();//readLine ile satır satır okuma yapılıyor.
			System.out.println(okunanSatir);
			okunanSatir = reader.readLine();
			System.out.println(okunanSatir);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}