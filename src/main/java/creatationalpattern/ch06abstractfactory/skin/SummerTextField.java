package creatationalpattern.ch06abstractfactory.skin;

/**
 * @author : Cory Jia on 11/25/19
 */
public class SummerTextField implements TextField {
    @Override
    public void display() {
        System.out.println("Display blue text field.");
    }
}
