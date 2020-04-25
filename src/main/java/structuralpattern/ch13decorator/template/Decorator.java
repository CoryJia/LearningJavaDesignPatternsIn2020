package structuralpattern.ch13decorator.template;

/**
 * @author coryjia@gmail.com
 * @date 4/12/20 9:09 PM
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation(){
        component.operation();
    }
}
