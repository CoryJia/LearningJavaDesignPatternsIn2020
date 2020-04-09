package structuralpattern.ch11bridge.template;

/**
 * @author coryjia@gmail.com
 * @date 4/8/20 9:01 PM
 */
public class Client {
    public static void main(String[] args) {
        ConcreteImplementor concreteImplementor = new ConcreteImplementor();
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction();
        refinedAbstraction.setImpl(concreteImplementor);
        refinedAbstraction.operation();
    }
}
