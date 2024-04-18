package Exception_Handling;

// Object --> Throwable--> Exception and Errors --> Exceptions----> Checked and Unchecked
// Checked Exceptions are checked during compile time while unchecked are checked during Runtime are not i.e divide  by 0
public class ExceptionHandling {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            // int c = a / b;
            divide(a, b);
            // System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will always execute no matter what");
        }
    }

    // Cannot have multiple finally blocks

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a / b;
    }

}
