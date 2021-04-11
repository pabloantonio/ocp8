package cap07;

import java.util.ArrayList;

public class ThrowNullPointerException {

    public static void main(String... args) {
        ArrayList<String> list = new ArrayList<String>();
        if (list != null) {
            list.add("1");
            // para los casos que se necesitan en los puntos sobre los
        }

        String[] newLaptops = new String[2];
       
        String[][] oldLaptops = 
                { 
                    { "Dell", "Toshiba", "Vaio" }, 
                    null, 
                    { "IBM" }, 
                    new String[10] 
                };

                System.out.println(oldLaptops[0][0]);
                System.out.println(oldLaptops[1]);
                System.out.println(oldLaptops[3][6]);
                System.out.println(oldLaptops);
                System.out.println(oldLaptops[3][0].length());        

    }

}
