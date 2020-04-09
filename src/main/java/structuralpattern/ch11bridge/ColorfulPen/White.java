package structuralpattern.ch11bridge.ColorfulPen;

/**
 * @author coryjia@gmail.com
 * @date 4/8/20 10:21 PM
 */
public class White implements Color {
    @Override
    public void paint(String penType, String name) {
        System.out.println("WHITE " + penType + " paint " + name);
    }
}
