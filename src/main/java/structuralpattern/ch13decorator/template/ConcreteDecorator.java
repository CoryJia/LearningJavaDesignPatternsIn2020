package structuralpattern.ch13decorator.template;

/**
 * @author coryjia@gmail.com
 * @date 4/12/20 9:11 PM
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }
    
    public void operation(){
        super.operation();
        addedBehavior();
    }

    private void addedBehavior() {
    }
}
