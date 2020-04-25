package structuralpattern.ch13decorator.transformer;

/**
 * @author coryjia@gmail.com
 * @date 4/24/20 11:50 PM
 */
public class Robot extends Changer {
    public Robot(Transform transform) {
        super(transform);
    }

    public void say(){
        System.out.println("Hello world!");
    }
}
