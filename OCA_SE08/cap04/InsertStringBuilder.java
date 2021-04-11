package cap04;

public class InsertStringBuilder {

    public static void main(String args[]) {
        StringBuilder sb1 = new StringBuilder("Bon");
        sb1.insert(2, 'r');
        System.out.println(sb1);

        StringBuilder sb = new StringBuilder("123");
        char[] name = { 'J', 'a', 'v', 'a' };
        sb.insert(1, name, 1, 3);
        System.out.println(sb);
    }

}
