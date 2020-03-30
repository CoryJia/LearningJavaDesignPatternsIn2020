package creatationalpattern.ch06abstractfactory.skin;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Cory Jia on 11/25/19
 */
public class FactoryMap {
    public static Map<String, Integer> factoryMap;
    static {
        factoryMap = new HashMap<>();
        factoryMap.put("SpringSkinFactory", 0);
        factoryMap.put("SummerSkinFactory", 1);
    }
}