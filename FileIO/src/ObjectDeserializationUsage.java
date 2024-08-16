import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectDeserializationUsage {
	public static void main(String[] args) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("otomobil.bin"))){
			Otomobil okunanOto;
			while ((okunanOto = (Otomobil) ois.readObject()) != null){
				System.out.println(okunanOto);
			}
		}
		catch (EOFException e){
			System.out.println("Okuma işlemi tamamlandı!");
		}
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}