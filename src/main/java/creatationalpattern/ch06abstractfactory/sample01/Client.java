package creatationalpattern.ch06abstractfactory.sample01;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new TclFactory();

        Television tv = factory.produceTelevision();
        AirConditioner ac = factory.produceAirConditioner();

        tv.play();
        ac.adjustTemperature();
    }
}
