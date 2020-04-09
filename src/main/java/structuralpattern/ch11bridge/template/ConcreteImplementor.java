package structuralpattern.ch11bridge.template;

/**
 * @author coryjia@gmail.com
 * @date 4/8/20 8:57 PM
 */
public class ConcreteImplementor implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("do something");
    }
}
