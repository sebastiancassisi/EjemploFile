package ejemplofile;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		
		//Creo un archivo en la carpeta "carpeta"
//		File file = new File("carpeta","sebastian.txt");
//		
//		if (!file.exists()) {
//			file.createNewFile();
//		}
		// Creo la carpeta Subcarpeta dentro de carpeta
//		File file = new File("carpeta","subcarpeta");
//		System.out.println(file.mkdir());
		
		// Le paso la referencia de la carpeta
		File file2 = new File("carpeta");
		File file = new File(file2,"sebastian.txt");
		System.out.println(file.createNewFile());
		
		
		

	}

}
