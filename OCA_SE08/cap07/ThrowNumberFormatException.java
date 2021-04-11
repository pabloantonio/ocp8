package cap07;

public class ThrowNumberFormatException {

    public static int convertToNum(String val) {
        int num = 0;
        try {
            num = Integer.parseInt(val, 16);
            System.out.println(num);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(val + " cannot be converted to hexadecimal number");
        }
        return num;
    }

    public static void main(String... agrs) {
        convertToNum("10");
    }
}
