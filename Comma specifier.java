package formatSpecifier;

import java.util.*;

public class FormatSpecifier {

  public static void main(String[] args) {

  
        // create Formatter class object 
        Formatter formatter = new Formatter(); 
  
        // comma Specifier 
        formatter = new Formatter(); 
        formatter.format("%, d", 1000000); 
        System.out.println(formatter); 
  
        // comma Specifier 
        formatter = new Formatter(); 
        formatter.format("%, .3f", 32659526566.4521); 
        System.out.println(formatter); 
  
  }
}
