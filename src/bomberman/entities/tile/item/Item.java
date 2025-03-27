package bomberman.entities.tile.item;

import bomberman.entities.Entity;
import bomberman.entities.character.Bomber;
import bomberman.entities.tile.Tile;
import bomberman.graphics.Sprite;
import bomberman.sound.Sound;

public abstract class Item extends Tile {
    protected int _duration = -1; // thoi gian cua item ,-1 la vo han
    protected boolean _active = false;
    protected int _level;

    public Item(int x, int y, Sprite sprite) {
        super(x, y, sprite);
    }

}