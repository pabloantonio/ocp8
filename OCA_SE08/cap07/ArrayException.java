package cap07;

import java.util.ArrayList;

public class ArrayException {

    public static void main(String... args) {
        String[] seasson = new String[] { "uno", "dos", "tres", "cuatro" };
        

        ArrayList<String> exams = new ArrayList<>();
        exams.add("SCJP");
        exams.add("SCWCD");
        
        System.out.println(exams.get(-1));
        System.out.println(exams.get(3));
    }

}
