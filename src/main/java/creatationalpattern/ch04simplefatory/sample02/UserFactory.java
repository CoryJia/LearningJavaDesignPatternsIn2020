package creatationalpattern.ch04simplefatory.sample02;

public class UserFactory {
    public static User getUser(int permission) {
        if (permission == 1) {
            return new Manager();
        }else {
            return new Employee();
        }
    }
}
