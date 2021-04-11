package cap03.com.mobile;

public class TestPhone {

    public static void main(String[] parametros) {
        Phone.softKeyboard = false;
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        Phone p3 = null;
        System.out.println(p1.softKeyboard);
        System.out.println(p2.softKeyboard);
        p1.softKeyboard = true;
        System.out.println(p1.softKeyboard);
        System.out.println(p2.softKeyboard);
        System.out.println(Phone.softKeyboard);

        System.out.println(p3.softKeyboard);
    }
}

class Phone {
    static boolean softKeyboard = true;
}
