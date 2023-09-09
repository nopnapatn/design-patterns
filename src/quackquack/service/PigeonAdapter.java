package quackquack.service;

import quackquack.Pigeon;
import quackquack.Quackable;

public class PigeonAdapter implements Quackable {
    private Pigeon pigeon;

    public PigeonAdapter(Pigeon pigeon) {
        this.pigeon = pigeon;
    }


    @Override
    public void quack() {
        pigeon.coo();
    }
}
