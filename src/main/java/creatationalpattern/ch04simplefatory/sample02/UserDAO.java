package creatationalpattern.ch04simplefatory.sample02;

public class UserDAO {
    public int findPermission(String userName, String password) {
        if (userName.equals("zhangsan") && password.equals("123456")) {
            return 1;
        }else return 0;
    }
}