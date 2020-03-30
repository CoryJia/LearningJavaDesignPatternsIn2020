package creatationalpattern.ch06abstractfactory.sample01;

public class TclTelevision implements Television {

    @Override
    public void play() {
        System.out.println("Turn on TCL television");
    }
}
