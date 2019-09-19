import java.io.*;
import java.util.*;
public class AberoOut {
    public static void main (String[] args)throws IOException {
    	System.out.println("Enter the name of the file: ");
    	Scanner read = new Scanner(System.in);
    	File file = new File(read.nextLine() +".txt");
    	read = new Scanner(file);
    	String printer = read.nextLine();
    	System.out.println(printer);
    	read.close();
    	
    }
    
}