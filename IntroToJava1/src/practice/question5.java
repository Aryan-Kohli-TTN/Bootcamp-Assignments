package practice;

class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String designation;

    public Employee() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.designation = "";
    }

    public Employee(String firstName, String lastName, int age, String designation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.designation = designation;
    }


    public Employee(Employee other) {
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.age = other.age;
        this.designation = other.designation;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return String.format("FirstName  : %s , LastName : %s , Age: %d  , Designation : %s ",firstName,lastName,age,designation);
    }


    public static void PrintData(Employee person){
        System.out.printf("%s %s , %d , %s\n",person.firstName, person.lastName,person.age, person.designation);
    }
}

public class question5 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        System.out.println(emp1);

        Employee emp2 = new Employee("Aryan", "Kohli", 21, "Software Engineer Trainee"); // Using parameterized constructor
        System.out.println(emp2);

        Employee emp3 = new Employee(emp2);
        System.out.println(emp3);

        emp1.setFirstName("Swapnil");
        emp1.setLastName("Khanna");
        emp1.setAge(29);
        emp1.setDesignation("Senior Software Engineer");
        System.out.println(emp1);

        Employee.PrintData(emp2);

    }
}