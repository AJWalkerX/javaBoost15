package files_methods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
	public static void main(String[] args) throws IOException {
		Path path = Path.of("C:\\java15files\\silinecek.txt");
//		Files.delete(path);
		Files.deleteIfExists(path);
		
//		Path pathCopy = Files.copy(Path.of("C:\\java15files\\hata.log"),
//		                           Path.of("C:\\java15files\\kopyala\\hataCopy.log"),
//		                           StandardCopyOption.REPLACE_EXISTING);
//		System.out.println(pathCopy);
		
//		Files.move(Path.of("C:\\java15files\\hata.log"),
//		           Path.of("C:\\java15files\\moveIt\\hataMoved.log"));
//		Files.createDirectory(Path.of("C:\\java15files\\created"));
//		Files.createFile(Path.of("C:\\java15files\\hata.log"));
	
		Files.walk(Path.of("C:\\java15files")).forEach(System.out::println);
		System.out.println();
		Files.walk(Path.of("C:\\java15files")).filter(Files::isRegularFile).forEach(System.out::println);
		System.out.println();
		List<Path> pdfFiles = Files.walk(Path.of("C:\\java15files"))
		                           .filter(path1 -> path1.toString().toLowerCase().endsWith(".pdf"))
		                           .toList();
		
		for (Path pdfFile : pdfFiles) {
			Path targetFile = Path.of("C:\\java15files\\pdfler").resolve(pdfFile.getFileName());
			Files.copy(pdfFile, targetFile);
			System.out.println("Copied: " + pdfFile + " to " + targetFile);
		}
		
	}
}