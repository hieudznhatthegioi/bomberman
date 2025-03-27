package bomberman.entities.tile.item;

import bomberman.Game;
import bomberman.entities.Entity;
import bomberman.entities.character.Bomber;
import bomberman.graphics.Sprite;
import bomberman.sound.Sound;

public class FlameItem extends Item {

    public FlameItem(int x, int y, Sprite sprite) {
        super(x, y, sprite);
    }

    @Override
    public boolean collide(Entity e) {
        // TODO: xử lý Bomber ăn
        if (e instanceof Bomber) {

            Sound.play("Item");
            Game.addBombRadius(1);
            remove();
        }
        return false;
    }
}