package practice;

class Aryan_Exception extends Exception {

    public Aryan_Exception(String message) {
        super(message, null, true, false);
    }

    public Aryan_Exception(String message, Throwable cause) {
        super(message, cause, true, false);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}

public class question9 {

    public static void main(String[] args) {
        try {
            if (Math.random() < 0.5) {
                throw new Aryan_Exception("value is less than 0.5 ");
            } else {
                IllegalArgumentException cause = new IllegalArgumentException("invalid arguement");
                throw new Aryan_Exception("Another problem with a cause.",cause);
            }
        } catch (Aryan_Exception e) {
            System.err.println("Custom Exception caught is : " + e.getMessage());

            if (e.getCause() != null) {
                System.err.println("Cause: " + e.getCause().getMessage());
            }

            //e.printStackTrace();
        }
    }
}

