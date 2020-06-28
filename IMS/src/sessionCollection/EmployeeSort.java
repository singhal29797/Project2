package sessionCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employee {

    int salary;
    String name;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}

class sortBySalary implements Comparator<Employee> {
    public int compare(Employee a, Employee b){
        return a.salary - b.salary;
    }
}

class sortByName implements Comparator<Employee> {   // in the comparator natural order is not maintained
                                                     // and when I do *b.name.compareTo(a.name)* then it reverse the order
    public int compare(Employee a, Employee b){
        return b.name.compareTo(a.name);
    }
}
class EmployeeSort{
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<>();

        arrayList.add(new Employee(18000,"Shivam"));
        arrayList.add(new Employee(17000,"Mayank"));
        arrayList.add(new Employee(20000,"Naman"));

        System.out.println("Unsorted");
        System.out.println(arrayList);

        System.out.println("\nSorted by Name");
        Collections.sort(arrayList,new sortByName());
        Iterator<Employee> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\nSorted by Salary");
        Collections.sort(arrayList,new sortBySalary());
        System.out.println(arrayList);
    }
}

