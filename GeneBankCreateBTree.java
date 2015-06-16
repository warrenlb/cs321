import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Driver program to generate a BTree from a parsed file.
 * @author csilkwor
 *
 */

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
		
		while(filescan.hasNext()){
			input = filescan.next();
			tokenizer = new StringTokenizer(input, " \t");
			
			while(tokenizer.hasMoreTokens()){
				word = tokenizer.nextToken();
			
				parsed+= word + " ";
				
			}
			
		}
		System.out.println(parsed);

	}

}
