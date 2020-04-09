package structuralpattern.ch11bridge.ColorfulPen;

/**
 * @author coryjia@gmail.com
 * @date 4/8/20 10:07 PM
 */
public abstract class Pen {
    protected Color color;

    public void setColor(Color color){
        this.color = color;
    }

    public abstract void draw(String name);
}
