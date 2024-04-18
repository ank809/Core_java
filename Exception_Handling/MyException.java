package Exception_Handling;

public class MyException extends Exception {
    MyException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try {
            String name = "rahul";
            if (name.equals("rahul")) {
                throw new MyException("Name is rahul");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will always run");
        }

    }
}
