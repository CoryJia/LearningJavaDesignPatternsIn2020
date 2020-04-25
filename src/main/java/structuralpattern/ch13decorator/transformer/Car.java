package structuralpattern.ch13decorator.transformer;

/**
 * @author coryjia@gmail.com
 * @date 4/24/20 11:47 PM
 */
public class Car implements Transform {
    public Car(){
        System.out.println("Transformer becomes a Car");
    }

    @Override
    public void move() {
        System.out.println("Moving on the ground");
    }
}
