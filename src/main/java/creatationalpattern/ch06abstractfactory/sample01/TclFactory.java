package creatationalpattern.ch06abstractfactory.sample01;

public class TclFactory implements AbstractFactory {
    @Override
    public Television produceTelevision() {
        return new TclTelevision();
    }

    @Override
    public AirConditioner produceAirConditioner() {
        return new TclAirConditioner();
    }
}
