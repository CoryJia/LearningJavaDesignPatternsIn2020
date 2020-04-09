package structuralpattern.ch11bridge.ColorfulPen;

/**
 * @author coryjia@gmail.com
 * @date 4/8/20 10:27 PM
 */
public class Client {
    public static void main(String[] args) {
        Color green = new Green();
        Pen bigPen = new BigPen();

        bigPen.setColor(green);
        bigPen.draw("Beautiful Rainy");
    }
}
