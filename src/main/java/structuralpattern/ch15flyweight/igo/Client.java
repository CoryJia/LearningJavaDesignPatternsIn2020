package structuralpattern.ch15flyweight.igo;

/**
 * @author coryjia@gmail.com
 * @date 4/29/20 9:41 PM
 */
public class Client {
    public static void main(String[] args) {
        IgoChessman black1, black2, black3, white1, white2;
        IgoChessmanFactory factory;

        factory = IgoChessmanFactory.getInstance();

        black1 = factory.getIgoChessman("b");
        black2 = factory.getIgoChessman("b");
        black3 = factory.getIgoChessman("b");

        System.out.println("verify if two black chessman is same: " + (black1 == black2));

        white1 = factory.getIgoChessman("w");
        white2 = factory.getIgoChessman("w");
        System.out.println("verify if two white chessman is same: " + (white1 == white2));

        black1.display(new Coordinates(1, 2));
        black2.display(new Coordinates(3, 4));
        black3.display(new Coordinates(5, 4));
        white1.display(new Coordinates(7, 8));
        white2.display(new Coordinates(9, 8));
    }
}
