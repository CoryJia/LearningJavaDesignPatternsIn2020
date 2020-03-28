package creatationalpattern.ch04simplefatory.sample02;

public class Client {
    public static void main(String[] args) {
        User user;

        int permission = new UserDAO().findPermission("LiSi", "123456");
        user = UserFactory.getUser(permission);
        user.sameMethod();
        user.differentMethod();
    }
}
