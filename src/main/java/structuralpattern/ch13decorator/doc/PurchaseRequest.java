package structuralpattern.ch13decorator.doc;

/**
 * @author coryjia@gmail.com
 * @date 4/12/20 9:39 PM
 */
public class PurchaseRequest implements Document {
    @Override
    public void display() {
        System.out.println("Display a request to purchase.");
    }
}
