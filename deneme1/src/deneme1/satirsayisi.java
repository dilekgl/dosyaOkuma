package deneme1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class satirsayisi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file= new File("C:\\Users\\selvihantatoglu\\Desktop\\java\\city.txt");
		readFile(file);
		}
		private static void readFile(File file) {
		// TODO Auto-generated method stub
		int lineNumber=0;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String satir=reader.readLine();
			while(satir!=null) {
				if(satir.length()>0) {
					lineNumber++;
				}
				satir=reader.readLine();
			}
			reader.close();
		}
		catch(final IOException e) {}
		System.out.println(lineNumber);
		

	}

}
