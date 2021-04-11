package cap01;

public class Accesos {

    public static  void main(String ... args){
    Emp emp1 = new Emp();
    Emp emp2 = new Emp();
    emp1.valor = 10;
    emp2.valor = 20;
    System.out.println(emp1.valor);
    System.out.println(emp2.valor);
    System.out.println(Emp.valor);
    }
}


class Emp{
    String nombre;
    static int valor;
}
