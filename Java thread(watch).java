package t;

public class watchTest {

  public static void main(String[] args) {
   Thread t=Thread.currentThread();
   t.setName("Afzalur Rahaman");
   int c=0,h=0;
   System.out.println(t);
   try {
     for(int i=0;i<61;i++)
     {
     if(i==60)
     i=0;
       System.out.print(i+" ");
       
       if(i==59)
       {
         c++;
         if(c<10)
     System.out.println("\n0"+h+":0"+c);
    else
       System.out.println("\n0"+h+":"+c);
       }
       if(c==60)
       {
       h++;
   System.out.println("\n"+(h%12)+":"+c);
         c=0;
       }
       if(h==23)
       h=0;
       Thread.sleep(1000);
     }
   }
   catch (InterruptedException e) {
 System.out.println("Main thread interrupted");
  }
}
}
