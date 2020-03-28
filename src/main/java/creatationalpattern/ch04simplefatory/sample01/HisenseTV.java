package creatationalpattern.ch04simplefatory.sample01;

public class HisenseTV implements TV {
    @Override
    public void play() {
        System.out.println("Turn on: " + this.getClass().getSimpleName());
    }
}
