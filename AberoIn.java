import java.io.*;
import java.util.*;


public class AberoIn {
    
    public static void main(String[] args) throws Exception {
    	
    	Scanner s = new Scanner(System.in);
    	System.out.print("Enter the Name you want: ");
    	String filename = s.nextLine();
    	filename = filename + ".txt";
    	
    	File input = new File(filename);
    	
    	 input.createNewFile();
    	FileWriter w = new FileWriter(filename);
    	
    	System.out.println(" ");
    	System.out.print("Enter Text You want in the file: ");
    	String text = s.next();
    	w.write(text);
    	w.flush();
    	
    }
    
}