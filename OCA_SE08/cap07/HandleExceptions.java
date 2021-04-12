package cap07;

import java.io.FileNotFoundException;

public class HandleExceptions {

    void method6() {
        try {
        } catch (Error e) {
        }
    }

    void method7() {
        try {
        } catch (Exception e) {
        }
    }

    void method8() {
        try {
        } catch (Throwable e) {
        }
    }

    void method9() {
        try {
        } catch (RuntimeException e) {
        }
    }

}
