package cap04;

public class AppendStringBuilder2 {


    public static void main(String args[]){
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        char[] valores = {'J','a','v','a','8'};
        sb.append("12345678123456789");
        sb.append(valores,1,3);
        System.out.println(sb);
    }
    
}
