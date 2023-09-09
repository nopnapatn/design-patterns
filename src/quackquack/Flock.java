package quackquack;

import java.util.ArrayList;

public class Flock implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    public void quack() {
        int i = 0;
        for (Quackable quacker : quackers) {
            if (i == 0) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Leader (" + (j + 1) + ") : ");
                    quacker.quack();
                }
                i++;
            } else {
                quacker.quack();
            }
        }
    }
}
