package creatationalpattern.ch06abstractfactory.sample01;

public class HaierAirConditioner implements AirConditioner{
    @Override
    public void adjustTemperature() {
        System.out.println("Haier AirConditioner begins adjust temperature");
    }
}
