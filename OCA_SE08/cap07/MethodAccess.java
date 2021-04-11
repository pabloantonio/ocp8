package cap07;

public class MethodAccess {

    public static void main(String args[]) {
        try {
            myMethod();
        } catch (Exception ex) {
            System.out.println("::" + ex.getMessage() + "::");
        }
    }

    public static void myMethod() {
        System.out.println("myMethod");
        myMethod();
    }
}
