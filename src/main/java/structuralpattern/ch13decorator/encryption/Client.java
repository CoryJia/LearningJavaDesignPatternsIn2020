package structuralpattern.ch13decorator.encryption;

/**
 * @author coryjia@gmail.com
 * @date 4/24/20 10:04 AM
 */
public class Client {
    public static void main(String[] args) {
        String password = "Rainy";
        String cpassword;
        Cipher sc, ac, cc;

        sc = new SimpleCipher();
        System.out.println(sc.getClass().getSimpleName());
        cpassword = sc.encrypt(password);
        System.out.println(cpassword);
        System.out.println("--------------------\n");

        cc = new ComplexCipher(sc);
        System.out.println(cc.getClass().getSimpleName());
        cpassword = cc.encrypt(password);
        System.out.println(cpassword);
        System.out.println("--------------------\n");

        ac = new AdvancedCipher(cc);
        System.out.println(sc.getClass().getSimpleName());
        cpassword = ac.encrypt(password);
        System.out.println(cpassword);
        System.out.println("--------------------\n");
    }
}
