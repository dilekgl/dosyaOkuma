package deneme1;
// import java.util.Scanner;
 import java.io.*;
 import java.io.FileReader;
public class deneme {

	public static void main(String[] args)throws IOException {
		
		FileReader f=new FileReader("C:\\Users\\selvihantatoglu\\Desktop\\java\\city.txt");
		BufferedReader in= new BufferedReader(f);
		
		String[] line = new String[2095793];
		for (int i=0;i<2095793;i++) {
			line[i]=in.readLine();
			if(line[i].startsWith("        \"id") || line[i].startsWith("        \"name")==true) {
				System.out.println(line[i]);
			}
		}
		f.close();
	}

	
	}


