package formatSpecifier;

import java.util.*;

public class FormatSpecifier {

  public static void main(String[] args) {

    // create Formatter class object
    Formatter f = new Formatter();

    // Use Space format specifier
    f.format("%d", -123);
    System.out.println(f);

    f = new Formatter();//new object create;
      //without new declare object doesn't work perfectly
    f.format("% d", 123);
    System.out.println(f);

f = new Formatter(); 
        f.format("%+d", 123); //print +123
        //print +
        System.out.println(f); 
      
        f = new Formatter(); 
        f.format("%d", 123); 
        System.out.println(f); 
        
        
  }
}



/*
    Output:
-123
 123
+123
123

*/
