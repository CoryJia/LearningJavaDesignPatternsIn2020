package creatationalpattern.ch06abstractfactory.skin;

/**
 * @author : Cory Jia on 11/25/19
 */
public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("Display green button.");
    }
}
