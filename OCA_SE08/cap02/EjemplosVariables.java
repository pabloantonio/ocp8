package cap02;

public class EjemplosVariables {


    private String $numbers= "";

    int _valor_de_uno_= 0;
    int _4_6 = 0;


    public static void main(String args[]){

            System.out.println("___variables__");
            int a = 10;
            int b = 20;
            int c = 40;
            System.out.println(a++ > 10 || ++b < 30);
            System.out.println(a > 90 && ++b < 30);
            System.out.println(!(c>20) && a==10 );
            System.out.println(a >= 99 || a <= 33 && b == 10);
            System.out.println(a >= 99 && a <= 33 || b == 10);


            int int1 = 10, int2 = 20, int3 = 30; 
            System.out.println(int1 % int2 );
            System.out.println(int1 % int2 * int3 );
            System.out.println(int1 % int2 * int3 + int1 / int2);

    }
}
