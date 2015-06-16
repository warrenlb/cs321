import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;


public class GeneBankCreateBTree {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("test1.gbk");
		Scanner filescan = new Scanner(file);
		String input;
		StringTokenizer tokenizer;
		String parsed = "";
		String word;
		String start = "ORIGIN";
		String end = "//";
		String p = "";
		
		while(filescan.hasNext()){
			input = filescan.next();
			tokenizer = new StringTokenizer(input, " \t");
			
			while(tokenizer.hasMoreTokens()){
				word = tokenizer.nextToken();
			
				parsed+= word + " ";
				
			}
			
		}
		System.out.println(parsed);
		Scanner scan = new Scanner(parsed);
		while(!scan.nextLine().equals("ORIGIN")){
			
			while(scan.hasNext()){
				p+=scan.next();
			}
		}
		
		
		System.out.println(p);
		

	}

}
