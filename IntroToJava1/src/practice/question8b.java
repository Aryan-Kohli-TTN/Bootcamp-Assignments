package practice;
import java.lang.Class;
import java.lang.ClassNotFoundException;

public class question8b {

    public static void main(String[] args) {
        try {
            Class<?> c1 = Class.forName("AryanClass");
            System.out.println("Class loaded  successfully: " + c1.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException has been caughten: " + e.getMessage());
        }
    }
}
