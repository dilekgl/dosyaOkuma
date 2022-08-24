package deneme;
import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Scanner;
public class Deneme {
		public static void main(String[] args) throws IOException {
			
			FileReader f=new FileReader("C:\\Users\\selvihantatoglu\\Desktop\\java\\city.txt");
			BufferedReader in= new BufferedReader(f);
			Scanner shr =new Scanner (System.in);
			System.out.println("gösterilecek sehiri giriniz");
			String sehir=shr.nextLine();
			int uzunluk=sehir.length()+19;
			String[] line = new String[2095793];
			for (int i=0;i<2095793;i++) {
				line[i]=in.readLine();
				 if(line[i].contains(sehir) && line[i].length()==uzunluk) {
					 System.out.println(line[i-1]);
					 for(int j=0;j<8;j++) {
					 System.out.println(line[i]);
					 line[i]=in.readLine();
					 }
					 break;
				
				 }

		}
			
	          shr.close();
	          in.close();

		}



}