package sessionCollection;

import java.util.*;
import java.lang.*;

class Student {
    int rollno;
    String name, address;

    public Student(int rollno, String name,
                   String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
    // Used to print student details in main()
    public String toString() {
        return this.rollno + " " + this.name +
                " " + this.address;
    }
}

class Sortbyroll implements Comparator<Student>{
    // Used for sorting in ascending order of roll number
    public int compare(Student a, Student b) {
        return a.rollno - b.rollno;
    }
}

class Sortbyname implements Comparator<Student>{
    // Used for sorting in ascending order of name
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}

// Driver class
public  class ComparatorSortList
{
    public static void main (String[] args)
    {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        arrayList.add(new Student(1, "Ram", "Delhi"));
        arrayList.add(new Student(3, "Mohan", "Jaipur"));
        arrayList.add(new Student(2, "Shyam", "Mumbai"));


        System.out.println("Unsorted");
//        for (int i=0; i<arrayList.size(); i++)
//            System.out.println(arrayList.get(i));
        System.out.println(arrayList);

        Collections.sort(arrayList, new Sortbyroll());

        System.out.println("\nSorted by rollno");
//        for (int i=0; i<arrayList.size(); i++)
//            System.out.println(arrayList.get(i));
        System.out.println(arrayList);

        Collections.sort(arrayList, new Sortbyname());

        System.out.println("\nSorted by name");
//        for (int i=0; i<arrayList.size(); i++)
//            System.out.println(arrayList.get(i));

        System.out.println(arrayList);
    }

}
