package structuralpattern.ch11bridge.ColorfulPen;

/**
 * @author coryjia@gmail.com
 * @date 4/8/20 10:19 PM
 */
public class Blue implements Color {
    @Override
    public void paint(String penType, String name) {
        System.out.println("BLUE " + penType + " paint" + name);
    }
}
