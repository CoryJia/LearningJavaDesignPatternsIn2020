package structuralpattern.ch12composite.fruits;

import java.util.ArrayList;
import java.util.List;

/**
 * @author coryjia@gmail.com
 * @date 4/9/20 3:35 PM
 */
public class Plate extends Fruit {
    List<Fruit> fruits = new ArrayList<>();

    @Override
    public void eat() {
        for (Fruit fruit : fruits) {
            fruit.eat();
        }
    }

    public void add(Fruit f) {
        fruits.add(f);
    }
}
