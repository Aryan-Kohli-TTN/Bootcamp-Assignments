package practiceQuestions;

import java.util.*;

class Employee implements Comparable<Employee>{
    private int age;
    public int salary;
    public String firstName;
    public String lastName;

    public Employee(int age, int salary, String firstName, String lastName) {
        this.age = age;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
     public int compareTo(Employee emp)
    {
        if(this.firstName.compareTo(emp.firstName)!=0) {
            return this.firstName.compareTo(emp.firstName);
        }
        else
            return this.lastName.compareTo(emp.lastName);
    }
}
class Salary_Comparator implements Comparator<Employee>
{

    @Override
    public int compare(Employee e1, Employee  e2) {
            return (e1.salary-e2.salary);
    }
}
public class collection_q2 {
    public static void main(String[] args) {

//            Employee e1 = new Employee(10, 100000, "Aryan", "Kohli");
//            Employee e2 = new Employee(22, 345500, "Aryan", "Aryan");
//            Employee e3 = new Employee(32, 145500, "piyush", "joshi");
//            ArrayList<Employee> emp_list = new ArrayList<Employee>();
//            emp_list.add(e1);
//            emp_list.add(e2);
//            emp_list.add(e3);
////            throw new NoClassDefFoundError();
//        Scanner
//            Collections.sort(emp_list);
//            for (Employee e : emp_list)
//                System.out.println(e.firstName + "  " + e.lastName);
//
//            Collections.sort(emp_list, new Salary_Comparator());
//            for (Employee e : emp_list)
//                System.out.println(e.firstName + "  " + e.lastName + "  " + e.salary);

        System.out.println(0.1*4==0.4);
        System.out.println(0.1*3==0.3);
        System.out.println(0.05*2==0.1);
        System.out.println(0.0512*2==0.1024);

    }
}
