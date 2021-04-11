package cap04;

import java.util.ArrayList;

public class Array {

    public static void main(String args[]) {
        String multiStrArr[][] = new String[][] { { "A", "B" }, null, { "Jan", "Feb", null }, };

        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("four");
        list.add(2, "three");

        for(String valor : list){
            System.out.println(valor);
        }
    }

}
