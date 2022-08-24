package deneme1;
import java.io.*;
import java.util.Scanner;

public class dosyaBulma {

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\selvihantatoglu\\Desktop\\java\\city.txt");
		Scanner city =new Scanner (f);
	//	while(city.hasNextLine()) {
			for (int i=0;i<10;i++) {
				if(i==1 || i == 7  || i==8 || i==9 ) {
				System.out.println(city.nextLine());
				}
		//	}

			
		}
		city.close();

	}

}

/*
for(int i = 0; i < 3; i++) {
			String isim = city.nextLine();
			for(int j=0; j<2; j++) {
				int donem = city.nextInt();
				double ortalama = city.nextDouble();
				System.out.println(isim + " adlı öğrencinin " + donem + ". dönem ortalaması: " + ortalama);
			}
 
 city.nextLine();}
 // ÇALIŞAN KOD
 /*			
 
public static void main(String[] args)throws IOException {

	FileReader f=new FileReader("C:\\Users\\selvihantatoglu\\Desktop\\java\\city.txt");
	BufferedReader in= new BufferedReader(f);
	
	String[] line = new String[1000000];
	for (int i=0;i<1000000;i++) {
		line[i]=in.readLine();
		if(line[i].startsWith("        \"id") || line[i].startsWith("        \"name")==true) {
			System.out.println(line[i]);
		}
	}
	f.close();
} */