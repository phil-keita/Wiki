import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;


public class extractor {
	public static void main(String[] args) throws IOException{
		
		String address = "https://www.google.com";
		URL url = new URL(address);
		Scanner in = new Scanner(url.openStream());
		in.useDelimiter("<");
		
		File outputFile1 = new File("wikiout1.txt");
		PrintWriter pen = new PrintWriter(outputFile1);
		 
		while (in.hasNext()) {
			
			pen.print(in.next());
			int i = 0;
			while(in.next().charAt(i) != '>'){
				char trash = in.next().charAt(i);
				i++;
			}
			
			pen.print(" ");
		}
		
	}
}
