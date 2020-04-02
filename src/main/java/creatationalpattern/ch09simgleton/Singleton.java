package creatationalpattern.ch09simgleton;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//IoHD: Initialization on Demand Holder
public class Singleton {
    private Singleton(){}

    private static class HolderClass{
        private final static Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return HolderClass.instance;
    }

    public static void main(String[] args) {
        List<Singleton> singletons = Stream.generate(Singleton::getInstance).limit(2).collect(Collectors.toList());

        System.out.println(singletons);

        System.out.println(singletons.get(0) == singletons.get(1));
    }
}
