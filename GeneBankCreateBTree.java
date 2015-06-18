import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.LinkedList;

/**
 * Driver program to generate a BTree from a parsed file.
 * @author csilkwor, lwarren
 *
 */

public class GeneBankCreateBTree {

	public static void main(String[] args) throws FileNotFoundException {


		
        boolean cont = false;
        boolean useCache;
        int degree;
        int sequenceLength;
        String filename = "";

//Whether to use a cache, write now its just a boolean indicator
        if(args[0].equals("0")){
            useCache = false;
        }
        else if (args[0].equals("1")){
            useCache = true;
        }
        else{
            //Error
        }

//Setting the degree
        degree = Integer.parseInt(args[1]);

//geting the file name
        if(args[2].contains(".gbk")){
            filename = args[2];
        }

//setting the desired sequence length and checking that it is between 1 and 31 inclusive
        sequenceLength = Integer.parseInt(args[3]);
        System.out.println("Length" + sequenceLength);
        if(sequenceLength < 1 || sequenceLength > 31){
            //Error
        }

		File file = new File(filename);
		Scanner filescan = new Scanner(file);
		char[] charArray;
		String word;
        String input;
        String line;
		String start = "ORIGIN";
		String end = "//";
        String sequence01 = "";
        LinkedList<String> list = new LinkedList<String>();
        long insertNumber;
        

        

		while(filescan.hasNext()){
			line = filescan.next();

            if(line.equals(start)){
                cont = true;
            }
                while(cont){
                    //reading in a string
                    word = filescan.next();
                    word.toLowerCase();
                    //converting it to a charArray to seperate the charaters
                    charArray = word.toCharArray();
                    // checking if  it is the end of the input sequence
                    if(word.equals("//")){
                        cont = false;
                    }
                    // adding each character to a linked list if it matches a,t,c, or g
                    for(int i = 0; i< word.length(); i++){
                        input = String.valueOf(charArray[i]);

                    
                        if(input.equals("a")){
                            list.add("00");
                            //00
                        }
                        else if(input.equals("t")){
                            list.add("11");
                            //11
                        }
                        else if(input.equals("c")){
                            list.add("01");
                            //01
                        }
                        else if(input.equals("g")){
                            list.add("10");
                            //10
                        }
                        else if(input.equals("n")){
                            list.add("n");
                            //n
                        }
                        else if(input.equals("/") || !filescan.hasNext()){
                            cont = false;
                        }
            //if the list is the desired length then that sequence key value is created in the long "insert"
            //it also checks for "n" characters
                        if(list.size() == sequenceLength){
                            sequence01= "";
                            for(String temp : list){
                                sequence01 += temp;
                            }
                            if(sequence01.indexOf("n") == -1){;
                                insertNumber = Long.parseLong(sequence01);
                                System.out.println(sequence01);
                                System.out.println(insertNumber);
                            }
                            list.removeFirst();
                        }
                    }


                }
        }
                    

	}

}
