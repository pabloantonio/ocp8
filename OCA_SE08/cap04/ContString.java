package cap04;

public class ContString {

    public static void main(String... args) {
        String summer = new String("Summer");
        String summer2 = "Summer";
        System.out.println("Summer");
        System.out.println("autumn");
        System.out.println("autumn" == "summer");
        String autumn = new String("Summer");

        String letters = "ABCAB";
        System.out.println(letters.replace('B', 'b'));
        System.out.println(letters);

        String lang = "Java";
        lang += " is everywhere!";
        System.out.println(lang);

        String initializedToNull = null;
        initializedToNull += "Java";
        System.out.println(initializedToNull);

        String lang1 = "Java";
        String lang2 = "JaScala";
        String returnValue1 = lang1.substring(0, 1);
        String returnValue2 = lang2.substring(0, 1);
        System.out.println(":: "+returnValue1+","+returnValue2);
        System.out.println(returnValue1 == returnValue2);
        System.out.println(returnValue1.equals(returnValue2));


        StringBuilder name1 = new StringBuilder();
        

    }
}
