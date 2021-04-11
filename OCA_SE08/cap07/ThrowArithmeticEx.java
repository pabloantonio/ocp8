package cap07;

public class ThrowArithmeticEx {


    public static void main(String args[]) {

        int a = 10;
        int y = a++;
        int z = y--;


        System.out.println(z);  // 10
        System.out.println(a);  // 11
        System.out.println(y);  // 9
        
        
        int x1 = a - 2*y - z;   // 11 -18 -10  = 11 -28 = -17
        System.out.println(x1);

        int x2 = a - 11;  // 11 - 11
        int x = x1/ x2;


        if(x>0){
            System.out.println(x);
        }

        System.out.println(0.0/0);
       


    }
    
}
