import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.NotSerializableException;

public class BufferedWriterUsage {
	public static void main(String[] args) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("takımlar", true))){
			writer.write("\nBursaspor");
		}
		catch (NotSerializableException e){
			System.err.println("Serializable imlimente işlemi yapılmadı!");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}