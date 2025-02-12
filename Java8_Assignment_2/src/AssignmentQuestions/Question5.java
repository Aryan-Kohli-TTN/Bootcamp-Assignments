package AssignmentQuestions;

import java.util.ArrayList;
import java.util.stream.Collectors;

class Employee{
    String fullName;
    Long salary;
    String city;

    public Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }
}
//Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
// Note: Full name is concatenation of first name, middle name and last name with single space in between.
public class Question5 {
    public static void main(String[] args) {
        ArrayList<Employee> arr = new ArrayList<Employee>();
        arr.add(new Employee("Vaibhav Kumar Gupta",1000212l,"Meerut"));
        arr.add(new Employee("Aryan Kohli lastName",21822l,"delhi"));
        arr.add(new Employee("Reena Sharma verma",7454l,"gorakhpur"));
        arr.add(new Employee("Aayush Mishra Tripathi",748214l,"noida"));
        arr.add(new Employee("Aashi Guopta Mishra",4482l,"delhi"));
        arr.add(new Employee("Vinod Mishaa kumar",1252l,"delhi"));

        System.out.println(


       arr.stream().filter(emp-> emp.salary<5000 && emp.city.equals("delhi")).map(emp->emp.fullName.split(" ")[0]).collect(Collectors.toList())
        );
    }
}
