package structuralpattern.ch10adapter.template;


/**
 * @author coryjia@gmail.com
 * @date 4/9/20 9:44 AM
 */
public class SingleAdapter implements Target {

    private Adaptee adaptee;

    public SingleAdapter() {
        this.adaptee = new Adaptee();
    }

    @Override
    public void specificRequest() {
        adaptee.specificRequest();//forward request
    }
}
