package practice;
public class question7 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 5};

        try {
            int result = divide(10, arr[3]); 
            System.out.println("Result of division: " + result);
            int value = arr[6];
            System.out.println("Value at index 6: " + value);
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Exception not covered aboveeee: " + e.getMessage());
        } finally {
            System.out.println("here is yje Finally block executed.");
        }
    }
    public static int divide(int a, int b) {
        return a / b;
    }
}