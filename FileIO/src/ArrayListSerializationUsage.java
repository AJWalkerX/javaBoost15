import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListSerializationUsage {
	public static void main(String[] args) {
		Ogrenci ogr1 = new Ogrenci("Alex", 101L);
		Ogrenci ogr2 = new Ogrenci("Ahmet", 102L);
		Ogrenci ogr3 = new Ogrenci("Selim", 103L);
		
		ArrayList<Ogrenci> ogrenciArrayList = new ArrayList<>();
		ogrenciArrayList.add(ogr1);
		ogrenciArrayList.add(ogr2);
		ogrenciArrayList.add(ogr3);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"))){
			oos.writeObject(ogrenciArrayList);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}