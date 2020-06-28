package sessionCollection;

import java.util.*;

public class Lists {
    public static void main(String[] args) {
        arrayList();
//        linkedList();
        //stack();
//        arrayListUsingIterator();
    }
    public static void arrayList(){
        List<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            arrayList.add(number);
        }
//      arrayList.add(1);
//      arrayList.add(1);
//      arrayList.add(15);
//      arrayList.add(15);

        System.out.println(arrayList);
    }

    public static void arrayListUsingIterator(){
        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(15);
        arrayList.add(15);

        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    public static void linkedList(){
        List<String> linkedList = new LinkedList<>();

        linkedList.add("B");
        linkedList.add("A");
        linkedList.add("C");
        linkedList.add("g");

        for(String str : linkedList)
        System.out.println(str);
    }

    public static void stack(){
        List<Integer> stack = new Stack<>();

        stack.add(12);
        stack.add(14);
        stack.add(14);
        stack.add(34);

        System.out.println(stack);

        for(int i = 0 ;i<stack.size();i++)
            System.out.println(stack.get(i));
    }




}

