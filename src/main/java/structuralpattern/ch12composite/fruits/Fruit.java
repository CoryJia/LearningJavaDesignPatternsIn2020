package structuralpattern.ch12composite.fruits;

/**
 * @author coryjia@gmail.com
 * @date 4/9/20 3:34 PM
 */
public class Fruit {
    public void eat(){
        System.out.println("Start to eat: " + this.getClass().getSimpleName());
    }
}
