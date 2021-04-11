package cap04;

public class ConstructoresString {

    public static void main(String args[]) {
        String girl = new String("Shreya");
        char[] name = new char[] { 'P', 'a', 'u', 'l' };
        String boy = new String(name);

        System.out.println("cadena por chars :"+boy);

        char [] valorChar = new char[]{'p','a','b','l','o'};
        String valor = new String(valorChar);
        System.out.println(valor);

        StringBuffer valorSB_pablo = new StringBuffer("pablo");
        String strValorPablo = new String(valorSB_pablo);
        StringBuffer valorSB_antonio= new StringBuffer("antonio");
        String strValorAntonio = new String(valorSB_antonio);

        System.out.println("valores "+strValorAntonio+","+strValorPablo);


    }

}
