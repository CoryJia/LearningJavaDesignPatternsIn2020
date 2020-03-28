package creatationalpattern.ch04simplefatory.product;

/**
 * @author : Cory Jia on 11/24/19
 */
public class Client {
    public static void main(String[] args) {
        Product product = Factory.getProduct("A");
        product.methodSome();
        product.methodDiff();
    }
}
