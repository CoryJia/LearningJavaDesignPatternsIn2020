package structuralpattern.ch14facade.template;

/**
 * @author coryjia@gmail.com
 * @date 4/28/20 10:58 PM
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method();
    }
}
