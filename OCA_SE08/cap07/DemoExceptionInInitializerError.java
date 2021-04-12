package cap07;

public class DemoExceptionInInitializerError {

    static{
        int num = Integer.parseInt("sd", 16);
    }
    
}
