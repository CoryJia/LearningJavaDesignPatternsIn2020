package structuralpattern.ch13decorator.ui;

/**
 * @author coryjia@gmail.com
 * @date 4/12/20 9:28 PM
 * 黑色边框装饰类： 具体装饰类
 */
public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    public void display() {
        this.setBlackBorder();
        super.display();
    }

    private void setBlackBorder() {
        System.out.println("Add black border for the current component.");
    }
}
