package structuralpattern.ch13decorator.transformer;

/**
 * @author coryjia@gmail.com
 * @date 4/24/20 11:51 PM
 */
public class Client {
    public static void main(String[] args) {
        Transform camacho;

        camacho = new Car();
        camacho.move();
        System.out.println("---------------------\n");

        AirPlane bumblebee = new AirPlane(camacho);
        bumblebee.move();
        bumblebee.fly();
    }
}
