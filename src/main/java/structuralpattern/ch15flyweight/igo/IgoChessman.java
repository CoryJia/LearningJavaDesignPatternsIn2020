package structuralpattern.ch15flyweight.igo;

import org.w3c.dom.ls.LSOutput;

/**
 * @author coryjia@gmail.com
 * @date 4/29/20 9:24 PM
 * Abstract flyweight class: Igo chessman
 */
public abstract class IgoChessman {
    public abstract String getColor();

    public void display(Coordinates coord){
        System.out.println("Color of this Igo chessman： " + this.getColor() + " position at: " + coord);
    }

}
