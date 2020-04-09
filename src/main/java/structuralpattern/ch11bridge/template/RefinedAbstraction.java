package structuralpattern.ch11bridge.template;

/**
 * @author coryjia@gmail.com
 * @date 4/8/20 9:00 PM
 */
public class RefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        impl.operationImpl();
    }
}
