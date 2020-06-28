package sessionCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentTraverses {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,6,3,7,34,7,4,7,46,4,7,7);

        // 1. Using List
        System.out.println(numbers+" ");

        // 2. Using Iterator
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        // 3. Using ForLoop
        for(int i=0;i<numbers.size();i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();

        // 4. Using ForEach Loop
        for(Integer i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 5. Using ForEach Method
        numbers.forEach((i) -> System.out.print(i+" "));



    }
}
