package creatationalpattern.ch04simplefatory.sample02;

public class Manager extends User {

    @Override
    public void differentMethod() {
        System.out.println(this.getClass().getSimpleName() + " can approve employee's vacation application");
    }
}
