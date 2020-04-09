package structuralpattern.ch11bridge.ColorfulPen;

/**
 * @author coryjia@gmail.com
 * @date 4/8/20 10:26 PM
 */
public class BigPen extends Pen {
    @Override
    public void draw(String name) {
        this.color.paint(this.getClass().getSimpleName(), name);
    }
}
