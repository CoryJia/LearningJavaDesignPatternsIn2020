package creatationalpattern.ch04simplefatory.sample01;


import org.junit.Test;

public class HaierTV implements TV{
    @Override
    public void play() {
        System.out.println("Turn on: " + this.getClass().getSimpleName());
    }

    @Test
    public void test(){
        this.play();
    }
}
