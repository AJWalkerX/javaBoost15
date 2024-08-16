import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerializationUsage {
	public static void main(String[] args) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("otomobil.bin"))){
			Otomobil oto1 = new Otomobil("Opel", "Insignia", 2020);
			Otomobil oto2 = new Otomobil("BMW", "3.16", 2020);
			Otomobil oto3 = new Otomobil("Audi", "A6", 2020);
			
			oos.writeObject(oto1);
			oos.writeObject(oto2);
			oos.writeObject(oto3);
//			oos.writeObject(null);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Yazma işlemi tamamlandı!");
	}
}