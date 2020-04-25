package structuralpattern.ch13decorator.doc;

/**
 * @author coryjia@gmail.com
 * @date 4/12/20 9:40 PM
 */
public class LeaveRequest implements Document {
    @Override
    public void display() {
        System.out.println("Display a request for leave.");
    }
}
