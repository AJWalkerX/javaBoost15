package file_methods;

import java.io.File;
import java.io.IOException;
import java.util.Date;

//"C:\\java15files"
public class Runner {
	public static void main(String[] args) {
		File file = new File("C:\\java15files");
		System.out.println("dosya var mı:... "+ file.exists()); //dosya yada klasör var mı diye kontrol eder.
		System.out.println("Dosyanın tam yolu: "+file.getAbsolutePath());
		try {
			System.out.println("Dosya Canonical path: "+file.getCanonicalFile());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("file.length(): "+file.length()+" byte"); //her bir kayıtlı karakterin uzunluğunu döner.
		System.out.println("file.getParent(): "+file.getParent());
		System.out.println("file.isFile(): "+file.isFile());
		System.out.println("file.isDirectory(): "+file.isDirectory());
		System.out.println("file.lastModified(): "+new Date(file.lastModified()));
//		file.delete();
	
	}
}