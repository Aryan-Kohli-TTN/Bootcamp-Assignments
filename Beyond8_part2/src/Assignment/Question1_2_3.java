package Assignment;
record Student(Integer id ,String name, Integer standard){

    public Student{
        if(id ==null)
            throw new IllegalArgumentException("Id is null");
        if(name==null)
            throw new IllegalArgumentException("name is null");
        if(standard==null)
            throw new IllegalArgumentException("standard is null");
    }
};
public class Question1_2_3 {
    public static void main(String[] args) {
        Student s1 = new Student(101,"Aryan",12);
        Student s4 = new Student(101,"Aryan",12);
        Student s2 = new Student(212,"Anshu",4);
        Student s3 = new Student(451,"Vaibhav",3);
        System.out.println(s1.name());
        System.out.println(s3.name());
        System.out.println(s2.name());
        System.out.println(s1.equals(s4));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}
