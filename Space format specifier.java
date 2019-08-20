package formatSpecifier;

import java.util.*;

public class FormatSpecifier {

  public static void main(String[] args) {

         // create Formatter class object 
        Formatter f= new Formatter(); 
  
        // right justify by default 
        f = new Formatter(); 
        f.format("%20.4f", 1234.1234); 
        System.out.println(f); 
  
        // left justify 
        f = new Formatter(); 
        f.format("%-20.4f", 1234.1234); 
        System.out.println(f); 
    } 
} 
