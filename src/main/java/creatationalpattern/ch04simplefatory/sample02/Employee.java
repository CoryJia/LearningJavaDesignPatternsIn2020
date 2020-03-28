package creatationalpattern.ch04simplefatory.sample02;

public class Employee extends User{
    @Override
    public void differentMethod() {
        System.out.println(this.getClass().getSimpleName() + " has to apply vacation");
    }
}
