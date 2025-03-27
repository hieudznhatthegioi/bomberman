package bomberman;

import bomberman.gui.Frame;
import bomberman.sound.Sound;

public class Main {
    // abcde
    public static void main(String[] args) {
        Sound.play("soundtrack");
        new Frame();
    }
}