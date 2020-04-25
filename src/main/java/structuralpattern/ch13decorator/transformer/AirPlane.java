package structuralpattern.ch13decorator.transformer;

/**
 * @author coryjia@gmail.com
 * @date 4/24/20 11:49 PM
 */
public class AirPlane extends Changer {
    public AirPlane(Transform transform) {
        super(transform);
    }

    public void fly(){
        System.out.println("Flying in the sky");
    }
}
