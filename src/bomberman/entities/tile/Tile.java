package bomberman.entities.tile;

import bomberman.entities.Entity;
import bomberman.graphics.Screen;
import bomberman.graphics.Sprite;
import bomberman.level.Coordinates;

/**
 * Entity cố định, không di chuyển
 */
public abstract class Tile extends Entity {

    public Tile(int x, int y, Sprite sprite) {
        _x = x;
        _y = y;
        _sprite = sprite;
    }

    /**
     * Mặc định không cho bất cứ một đối tượng nào đi qua
     * 
     * @param e
     * @return
     */
    @Override
    public boolean collide(Entity e) {
        return false;// khong cho di qua
    }

    @Override
    public void render(Screen screen) {
        screen.renderEntity(Coordinates.tileToPixel(_x), Coordinates.tileToPixel(_y), this);
    }

    @Override
    public void update() {
    }
}