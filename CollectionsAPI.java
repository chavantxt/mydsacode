package mydsacode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Set;

public class CollectionsAPI {
    public static void main(String args[]){


        //Set
          Set<String> hash_Set = new HashSet<String>(); 
  
        // Adding elements to the Set 
        // using add() method 
        hash_Set.add("Geeks"); 
        hash_Set.add("For"); 
        hash_Set.add("Geeks"); 
        hash_Set.add("Example"); 
        hash_Set.add("Set"); 
  
        // Printing elements of HashSet object 
        System.out.println(hash_Set);

        

        //List
        //ArrayList
        //O(N)
    ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);	    
	    cars.get(0);
	    cars.set(0, "Opel");
	    cars.remove(0);
	    cars.clear();
	    cars.size();

        //LinkedList
        LinkedList<String> cars3 = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

       PriorityQueue<Integer> queue=new PriorityQueue<>();
       queue.offer(4);
       queue.offer(5);
       queue.offer(1);









    }
}
