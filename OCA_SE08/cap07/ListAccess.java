package cap07;

import java.util.ArrayList;

public class ListAccess {

    public static void main(String... args) {
        ArrayList<Ink> inks = new ArrayList<Ink>();

        inks.add(new ColorInk());
        inks.add(new BlackInk());
        if (inks.get(0) instanceof BlackInk) {
            System.out.println((BlackInk) inks.get(0));
        }

    }
}

class Ink {

}

class ColorInk extends Ink {

}

class BlackInk extends Ink {

}
