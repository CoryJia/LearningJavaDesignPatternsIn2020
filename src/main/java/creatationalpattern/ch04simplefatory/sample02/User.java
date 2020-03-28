package creatationalpattern.ch04simplefatory.sample02;

public abstract class User {
    public void sameMethod() {
        System.out.println("Create a new " + this.getClass().getSimpleName() + " object");
    }

    public abstract void differentMethod();
}
