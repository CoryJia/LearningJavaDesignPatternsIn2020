package structuralpattern.ch13decorator.transformer;

/**
 * @author coryjia@gmail.com
 * @date 4/24/20 11:48 PM
 */
public class Changer implements Transform {
    private Transform transform;

    public Changer(Transform transform) {
        this.transform = transform;
    }

    @Override
    public void move() {
        transform.move();
    }
}
