package cap03;

public class Examples {

    String name;
    int age;

    Examples() {
       
        System.out.println("constructor no args");
    }

    Examples(String newName, int newAge) {
        System.out.println("constructor args[" + newName + "," + newAge + "]");
        name = newName;
        age = newAge;
    }

    Examples(String newName, int newAge, boolean isNuevo) {
        this(newName, newAge);
        System.out.println("constructor args[" + isNuevo + "]");
    }

}
