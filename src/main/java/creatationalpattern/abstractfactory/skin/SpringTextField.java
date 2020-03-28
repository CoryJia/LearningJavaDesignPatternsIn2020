package creatationalpattern.abstractfactory.skin;

/**
 * @author : Cory Jia on 11/25/19
 */
public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("Display green text field.");
    }
}
