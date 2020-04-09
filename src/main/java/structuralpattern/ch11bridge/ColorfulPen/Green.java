package structuralpattern.ch11bridge.ColorfulPen;

/**
 * @author coryjia@gmail.com
 * @date 4/8/20 10:20 PM
 */
public class Green implements  Color {
    @Override
    public void paint(String penType, String name) {
        System.out.println("GREEN " + penType + " paint " + name);
    }
}
