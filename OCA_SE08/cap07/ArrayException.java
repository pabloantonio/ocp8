package cap07;

import java.util.ArrayList;

public class ArrayException {

    public static void main(String... args) {
        ArrayList<String> exams = new ArrayList<>();
        exams.add("SCJP");
        exams.add("SCWCD");
        
        System.out.println(exams.get(-1));
        System.out.println(exams.get(3));
    }

}
