import java.util.*;
class Employee
{
    String name;
    int age;
    String degree;
    String email;
    double mobile;
    String dob;
    public Employee(String name, int age, String degree, String email, double mobile, String dob)
    {
        this.name=name;
        this.age=age;
        this.degree=degree;
        this.email=email;
        this.mobile=mobile;
        this.dob=dob;
    }
}

public class ArrayListExample
{
    public static void main(String[] args)
    {
        Employee e[]=new Employee[6];
        String name;
        int age;
        String degree;
        String email;
        double mobile;
        String dob;
        Scanner sc=new Scanner(System.in);
        int p=1;
        for(int i=0;i<2;i++)
        {
            System.out.print("Enter the "+p+" Employee Age :");
            age=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the "+p+" Employee Name :");
            name=sc.nextLine();
            System.out.print("Enter the "+p+" Employee Degree :");
            degree=sc.nextLine();
            System.out.print("Enter the "+p+" Employee Email :");
            email=sc.nextLine();
            System.out.print("Enter the "+p+" Employee dob :");
            dob=sc.nextLine();
            System.out.print("Enter the "+p+" Employee Mobile No.:");
            mobile=sc.nextDouble();

            p=p+1;
            e[i]=new Employee(name,age,degree,email,mobile,dob);
        }

        ArrayList <Employee> emp = new ArrayList<Employee>();
        for(int i=0;i<2;i++)
        emp.add(e[i]);

        for(Employee em : emp)
        {
            System.out.println("=============================================================================================================================");
            System.out.println("Name : "+em.name+"     Age : "+em.age+"     DOB : "+em.dob+"     Highest Degree : "+em.degree+"    Email : "+em.email+"     Mobile No. : "+em.mobile);

        }
        System.out.println("=============================================================================================================================");
    }
}
