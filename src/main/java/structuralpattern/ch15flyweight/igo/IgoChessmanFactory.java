package structuralpattern.ch15flyweight.igo;

import creatationalpattern.ch09simgleton.Singleton;

import java.util.HashMap;

/**
 * @author coryjia@gmail.com
 * @date 4/29/20 9:32 PM
 * Flyweight factory class: Igo chessman factory implemented by Singleton patter
 */
public class IgoChessmanFactory {
    private static HashMap map; // use a hashmap as flyweight pool

    private IgoChessmanFactory(){
        map = new HashMap();
        IgoChessman black = new BlackIgoChessman();
        IgoChessman white = new WhiteIgoChessman();

        map.put("b", black);
        map.put("w", white);
    }

    public static IgoChessmanFactory getInstance() {
        return IgoChessmanFactory.HolderClass.instance;
    }


    private static class HolderClass{
        private final static IgoChessmanFactory instance = new IgoChessmanFactory();
    }

    public static IgoChessman getIgoChessman(String color){
        return  (IgoChessman)map.get(color);
    }
}
