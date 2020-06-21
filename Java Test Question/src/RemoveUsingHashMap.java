import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

/*
 * Java Program to remove key value pair from Map while
 * iteration.
 */
public class RemoveUsingHashMap {

  public static void main(String[] args) 
{

    // create a Map to demonstrate example
    

    Map<String, Double> priceMap = new HashMap<String, Double>();
    Scanner sc=new Scanner(System.in);
    
    // add some mapping e.g. popular Java books and their prices
    

    System.out.println("Enter the size of hashmap");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
    	priceMap.put(sc.next(), sc.nextDouble());
    }
    Set<Entry<String, Double>> setOfEntries = priceMap.entrySet();

    // get the iterator from entry set
    
    Iterator<Entry<String, Double>> iterator = setOfEntries.iterator();
    
    //Map<String,Double> gfg = new HashMap<String,Double>();
     
     System.out.println("Enter Your Key Want to be delete");
     String remove=sc.next();
     for (Map.Entry<String,Double> entry : priceMap.entrySet())  
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
    while (iterator.hasNext()) {
      Entry<String, Double> entry = iterator.next();
      String key = entry.getKey();
      if (key.equals(remove)) {
        System.out.println("removeing : " + entry);

        iterator.remove(); // use remove() method of iterator
      }
       
    // iterate of map
    }
    System.out.println("After Delete");
    for (Map.Entry<String,Double> entry : priceMap.entrySet())  
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
  }
}