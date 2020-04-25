package structuralpattern.ch13decorator.ui;

/**
 * @author coryjia@gmail.com
 * @date 4/12/20 9:30 PM
 */
public class Client {
    public static void main(String[] args) {
        Component component, componentSB;

        component = new Window();
        componentSB = new ScrollBarDecorator(component);
        componentSB.display();
    }
}
