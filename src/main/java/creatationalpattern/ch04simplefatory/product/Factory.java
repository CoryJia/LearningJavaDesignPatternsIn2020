package creatationalpattern.ch04simplefatory.product;

/**
 * @author : Cory Jia on 11/24/19
 */
public class Factory {
    public static Product getProduct(String arg) {
        Product product = null;

        if (arg.equals("A")) {
            product = new ConcreteProductA();
        } else if (arg.equals("B")) {
            product = new ConcreteProductB();
        }
        return product;
    }
}
