package practice;

public class question8 {
    public static void main(String[] args) {
        try {
            MissingClass myObj = new MissingClass();
            myObj.print();
        } catch (NoClassDefFoundError e) {
            System.out.println("NoClassDefFoundError has been caughtem here: " + e.getMessage());
        }
    }
}
