package cap07;

public class DivideByZeroPointZero {
    public static void main(String args[]) {

        int a = 10;
        int y = a++;
        int z = y--;

        System.out.println(a);  // 11
        System.out.println(y);  // 9
        System.out.println(z);  // 10

        int x1 = a - 2 * y - z;  // 11 - 18 - 10 = -17
        int x2 = a - 11;      // 0
        double x3 = x2;       // 0
        double x = x1 / x3;   //  aex
        System.out.println(x);   // aex
        System.out.println(x1);  // -17
        System.out.println(x3);  // 0
    }
}
