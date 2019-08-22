package linkedlist_1;
import java.util.*;
public class linkedlist1 {

  public static void main(String[] args) {

        LinkedList<Integer> object = new LinkedList<Integer>(); 

        object.add(88888); 

        object.add(999); 

        object.addLast(90); 

        object.addFirst(77); 

        object.add(2, 5); 

        object.add(60); 

        object.add(80); 

        System.out.println("Linked list : " + object); 

        object.remove(4); 

        object.remove(3); 

        object.removeFirst(); 

        object.removeLast(); 

        System.out.println("Linked list after deletion: " + object); 
  }
}


/*


output: 

Linked list : [77, 88888, 5, 999, 90, 60, 80]
Linked list after deletion: [88888, 5, 60]


*/
