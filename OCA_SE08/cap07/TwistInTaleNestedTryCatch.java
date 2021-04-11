package cap07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TwistInTaleNestedTryCatch {

    static FileInputStream players, coach;

    public static void main(String... args) {
        try {
            players = new FileInputStream("players.txt");
            System.out.println("players.txt found");
            try {
                coach.close();
            } catch (IOException e) {
                System.out.println("coach.txt not found");
            }
        } catch (FileNotFoundException fnfex) {
            System.out.println("No se encuentra el archivo players.txt");
        } catch(NullPointerException npex){
            System.out.println("NullPointerException");
        }
    }
}
