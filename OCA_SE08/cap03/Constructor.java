package cap03;

public class Constructor {

    {
        System.out.println("::: clase anonima 1");
    }
    {
        System.out.println("::: clase anonima 2");
    }

    private Constructor() {
        System.out.println("::: constructor :::");
    }

    public static void main(String args[]) {
        Constructor emp = new Constructor();

    }

}
