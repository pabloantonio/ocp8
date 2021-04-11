package cap04;


public class Cadenas {
    
    public static void main(String args[]){
        String str1 = new String("Paul");
        String str2 = new String("Paul");

        if(str1==str2){
            System.out.println("referencias iguales");
        }else{
            System.out.println("referencias no iguales");
        }

        String _cadena_1_ = "uno";
        String _cadena_2_ = "uno";

        System.out.println(_cadena_1_ == _cadena_2_);

        String morning1 = "Morning";
        System.out.println("Morning" == morning1);


        String morning2 = new String("Morning");
        System.out.println("Morning" == morning2);

        String h = "HOLA";
        h.concat(" Y ADIOS");
        System.out.println("h ::"+h);
    }
}
