package cap03.com;

public class Exam {

    private String name;
    private Exam other;

    public Exam(String name) {
        this.name = name;
    }

    public void setExam(Exam exam) {
        other = exam;
    }


    public String getName(){
        return name;
    }

    public Exam getExam(){
        return other;
    }


    public void print(String salida , String ... params ){

        for(int i = 0 ; i<params.length ; i++){
            System.out.println(params[i]);
        }

    }

}


class IslandOfIsolation {
        public static void main(String args[]){
            Exam php = new Exam("PHP");
            Exam java = new Exam("Java");

            php.setExam(java);
            java.setExam(php);

            System.out.println(php.getExam().getName());
            System.out.println(java.getExam().getName());

            php.print("salida", "1","2","3");

        }
}
