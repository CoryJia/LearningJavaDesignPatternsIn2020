package creatationalpattern.ch06abstractfactory.sample01;

public class HaierFactory implements AbstractFactory{
    @Override
    public Television produceTelevision() {
        return new HaierTelevision();
    }

    @Override
    public AirConditioner produceAirConditioner() {
        return new HaierAirConditioner();
    }
}
