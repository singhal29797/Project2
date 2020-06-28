package sessionCollection;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        //hashSet();
        linkedHashSet();
        //treeSet();
    }
    public static void hashSet(){
        HashSet<Integer> hs = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            hs.add(number);
        }
//      arrayList.add(1);
//      arrayList.add(1);
//      arrayList.add(15);
//      arrayList.add(15);

        System.out.println(hs);
    }

    public static void linkedHashSet(){
        LinkedHashSet<Integer> ls = new LinkedHashSet<>();

        ls.add(1);
        ls.add(13);
        ls.add(15);
        ls.add(12);
        ls.add(13);
        ls.add(13);
        ls.add(16);
        ls.add(178);
        Iterator<Integer> iterator = ls.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for(Integer str : ls)
            System.out.println(str);

        System.out.println(ls);
    }

    public static void treeSet(){
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(1);
        ts.add(13);
        ts.add(15);
        ts.add(12);
        ts.add(13);
        ts.add(13);
        ts.add(16);
        ts.add(178);

        System.out.println(ts);
    }
}
