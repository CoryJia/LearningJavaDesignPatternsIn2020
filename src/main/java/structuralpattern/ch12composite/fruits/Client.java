package structuralpattern.ch12composite.fruits;

import java.util.List;

/**
 * @author coryjia@gmail.com
 * @date 4/9/20 3:37 PM
 */
public class Client {
    public static void main(String a[]) {
        Fruit obj1, obj2, obj3, obj4, obj5;
        Plate plate1, plate2, plate3;

        obj1 = new Apple();
        obj2 = new Pear();
        plate1 = new Plate();
        plate1.add(obj1);
        plate1.add(obj2);

        obj3 = new Banana();
        obj4 = new Banana();
        plate2 = new Plate();
        plate2.add(obj3);
        plate2.add(obj4);

        obj5 = new Apple();
        plate3 = new Plate();
        plate3.add(plate1);
        plate3.add(plate2);
        plate3.add(obj5);


        consume(plate1);
        consume(plate2);
        consume(plate3);
    }

    private static void consume(Plate plate) {

        System.out.println("Eat fruits");
        plate.eat();
        System.out.println("Eat out\n");

    }
}
