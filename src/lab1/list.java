package lab1;
import java.util.*;

public class list {
 
    public static void main(String args[])
    {
        
    	LinkedList<String> ll = new LinkedList<>(); 
 
        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.add("F");
        ll.add("G");
        ll.add("F");
        ll.add(1, "C"); 
        System.out.println(ll);
        ll.set(1, "B"); 
        ll.set(2, "C"); 
        ll.set(3, "D"); 
        ll.set(4, "E"); 
        System.out.println(ll);
        ll.remove(0); 
        ll.remove("E"); 
        System.out.println(ll);
   
         System.out.println(); 
         for (String str : ll) 
            System.out.print(str + " "); 
         
         System.out.println();
         System.out.println("Initial LinkedList " + ll); 
         ll.set(1, "CC"); 
         System.out.println("Updated LinkedList " + ll); 
         
         System.out.println("The first element is: " + ll.getFirst());
    }
}