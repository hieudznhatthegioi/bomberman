package bomberman;

import bomberman.gui.Frame;
import bomberman.sound.Sound;

public class Main {
    //dfnjs
    public static void main(String[] args) {
        Sound.play("soundtrack");
        new Frame();
    }
}