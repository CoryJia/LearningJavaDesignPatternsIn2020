package structuralpattern.ch15flyweight.igo;

/**
 * @author coryjia@gmail.com
 * @date 4/29/20 9:26 PM
 * Concrete flyweight class: Black igo chessman
 */
public class BlackIgoChessman extends IgoChessman {
    @Override
    public String getColor() {
        return "Black";
    }
}
