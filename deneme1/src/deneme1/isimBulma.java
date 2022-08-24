package deneme1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.util.Scanner;


public class isimBulma {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader f=new FileReader("C:\\Users\\selvihantatoglu\\Desktop\\java\\city.txt");
		BufferedReader in= new BufferedReader(f);
		String sehir ="\"ankara\",";
		
		String[] line = new String[2095793];
		for (int i=0;i<2095793;i++) {
			line[i]=in.readLine();
			 if(line[i].endsWith(sehir)) {
				 System.out.println(line[i-1]);
				 for(int j=0;j<8;j++) {
				 System.out.println(line[i]);
				 line[i]=in.readLine();

				
			
				 }
			
			 }

	}

in.close();
}
}