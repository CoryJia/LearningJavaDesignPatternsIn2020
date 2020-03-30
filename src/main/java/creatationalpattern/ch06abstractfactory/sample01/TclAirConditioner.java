package creatationalpattern.ch06abstractfactory.sample01;

public class TclAirConditioner implements AirConditioner{
    @Override
    public void adjustTemperature() {
        System.out.println("TCL AirConditioner begins adjust temperature");
    }
}
