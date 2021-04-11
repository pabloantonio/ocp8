package cap07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.imageio.stream.FileImageOutputStream;

public class ReThrowException {

    FileInputStream soccer;


    /**
     * 
     * @throws FileNotFoundException
     */
    public void metodo() throws FileNotFoundException{

        try {
            soccer = new FileInputStream("soccer.txt");
        } catch (FileNotFoundException ex) {
            throw ex;
        }
    }


    /**
     * 
     * @param nombre
     * @throws FileNotFoundException
     */
    public void metodo(String nombre) throws FileNotFoundException {
        soccer = new FileInputStream(nombre);
    }

    
}
