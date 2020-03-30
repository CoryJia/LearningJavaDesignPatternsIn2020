package creatationalpattern.ch06abstractfactory.sample01;

public class HaierTelevision implements Television{
    @Override
    public void play() {
        System.out.println("Now turn on Haier TV");
    }
}
