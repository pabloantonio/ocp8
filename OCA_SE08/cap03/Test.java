package cap03;

class Persona {

    private String name;

    Persona(){

    }

    Persona(String newName) {
        this();
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setName(String val) {
        name = val;
    }

}

public class Test {

    public static void swap(Persona p1, Persona p2) {
        Persona temp = new Persona();
        temp.setName(p2.getName());

        p2.setName(p1.getName());
        p1.setName(temp.getName());
    }

    public static void resetValueOfMemberVariable(Persona p1, Persona p2) {
        p1.setName(p2.getName());
    }

    public static void main(String args[]) {
        Persona person1 = new Persona("John");
        Persona person2 = new Persona("Pablo");
        System.out.println(person1.getName());
        //resetValueOfMemberVariable(person1,person2);
        
        swap(person1, person2);
        System.out.println(person1.getName()+","+person2.getName());


    }

}
