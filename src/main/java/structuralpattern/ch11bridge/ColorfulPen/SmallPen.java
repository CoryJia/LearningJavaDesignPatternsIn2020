package structuralpattern.ch11bridge.ColorfulPen;

/**
 * @author coryjia@gmail.com
 * @date 4/8/20 10:22 PM
 */
public class SmallPen extends Pen {
    @Override
    public void draw(String name) {
        this.color.paint(this.getClass().getSimpleName(), name);
    }
}
