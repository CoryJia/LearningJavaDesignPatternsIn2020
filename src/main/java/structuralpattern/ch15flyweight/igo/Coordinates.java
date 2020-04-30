package structuralpattern.ch15flyweight.igo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author coryjia@gmail.com
 * @date 4/29/20 10:30 PM
 */

@Getter
@Setter
public class Coordinates {
    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
