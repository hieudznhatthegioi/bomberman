package bomberman.entities.character;

import bomberman.Board;
import bomberman.Game;
import bomberman.entities.AnimatedEntitiy;
import bomberman.graphics.Screen;

/**
 * Bao gồm Bomber và Enemy
 */
public abstract class Character extends AnimatedEntitiy {

    protected Board _board;
    protected int _direction = -1;
    protected boolean _alive = true;
    protected boolean _moving = false;
    public int _timeAfter = 40;

    public Character(int x, int y, Board board) {
        _x = x;
        _y = y;
        _board = board;
    }

    @Override
    public abstract void update();

    @Override
    public abstract void render(Screen screen);

    /**
     * Tính toán hướng đi
     */
    protected abstract void calculateMove();

    protected abstract void move(double xa, double ya);

    /**
     * Được gọi khi đối tượng bị tiêu diệt
     */
    public abstract void kill();

    /**
     * Xử lý hiệu ứng bị tiêu diệt
     */
    protected abstract void afterKill();

    /**
     * Kiểm tra xem đối tượng có di chuyển tới vị trí đã tính toán hay không
     * 
     * @param x
     * @param y
     * @return
     */
    protected abstract boolean canMove(double x, double y);

    protected double getXMessage() {
        return (_x * Game.SCALE) + (_sprite.SIZE / 2 * Game.SCALE);
    }

    protected double getYMessage() {
        return (_y * Game.SCALE) - (_sprite.SIZE / 2 * Game.SCALE);
    }

}