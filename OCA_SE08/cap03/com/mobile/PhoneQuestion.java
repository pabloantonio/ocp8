package cap03.com.mobile;

public class PhoneQuestion {

    String phoneNumber = "123456789";

    void setNumber () {
        String phoneNumber;
        phoneNumber = "987654321";
    }    
}


class AnswerTestPhone {
    public static void main(String[] args) {
        PhoneQuestion p1 = new PhoneQuestion();
        p1.setNumber();
        System.out.println (p1.phoneNumber);
} }
