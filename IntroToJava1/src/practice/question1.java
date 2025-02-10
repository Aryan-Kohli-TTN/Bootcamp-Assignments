package practice;
class Person{
    private String firsName;
    private String lastName;
    private int age;
    public static String location ="Delhi";

    Person(String firstName,String lastName , int age){
        this.firsName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    static {
        System.out.println("Static Block is here");
    }
    public static void PrintData(Person person){
        System.out.printf("%s %s , %d \n",person.firsName, person.lastName,person.age);
    }
}
public class question1 {
    public static void main(String[] args) {
        Person p1 = new Person("Aryan","Kohli",21);
        Person.PrintData(p1);
        System.out.printf("Location is %s \n",Person.location);
    }
}
