package creatationalpattern.ch07biulder;

/**
 * @author coryjia@gmail.com
 * @date 4/5/20 8:50 PM
 */
public class Client {
    public static void main(String[] args) {
        ActorBuilder ab = new AngelBuilder();

        ActorController ac = new ActorController();
        Actor angel = ac.construct(ab);

        System.out.println(angel);
    }
}
