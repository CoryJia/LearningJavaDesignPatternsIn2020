package structuralpattern.ch15flyweight.igo;

/**
 * @author coryjia@gmail.com
 * @date 4/29/20 9:27 PM
 * Concrete flyweight class: While color igo chessman
 */
public class WhiteIgoChessman extends  IgoChessman{

    @Override
    public String getColor() {
        return "White";
    }
}
