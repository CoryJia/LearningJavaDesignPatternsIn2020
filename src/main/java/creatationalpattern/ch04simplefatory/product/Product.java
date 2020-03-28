package creatationalpattern.ch04simplefatory.product;

/**
 * @author : Cory Jia on 11/24/19
 */
public abstract class Product {
    //common method
    public void methodSome() {
        //implementation of commonly used method
        System.out.println("Perform common behaviors");
    }

    //different specific method
    public abstract void methodDiff();
}
