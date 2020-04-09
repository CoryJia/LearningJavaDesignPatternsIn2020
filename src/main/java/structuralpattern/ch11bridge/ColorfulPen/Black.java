package structuralpattern.ch11bridge.ColorfulPen;

/**
 * @author coryjia@gmail.com
 * @date 4/8/20 10:17 PM
 */
public class Black implements Color {
    @Override
    public void paint(String penType, String name) {
        System.out.println("BLACK " + penType + " paint " + name);
    }
}
