package structuralpattern.ch13decorator.ui;

/**
 * @author coryjia@gmail.com
 * @date 4/12/20 9:23 PM
 * 滚动条装饰类： 具体装饰类
 */
public class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    public void display(){
        this.setScrollBar();
        super.display();
    }

    private void setScrollBar() {
        System.out.println("Add Scroll Bar for the current component.");
    }
}
