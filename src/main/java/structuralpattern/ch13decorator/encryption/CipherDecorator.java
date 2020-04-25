package structuralpattern.ch13decorator.encryption;

/**
 * @author coryjia@gmail.com
 * @date 4/24/20 9:50 AM
 */
public class CipherDecorator implements Cipher {
    private Cipher cipher;

    public CipherDecorator(Cipher cipher) {
        this.cipher = cipher;
    }

    @Override
    public String encrypt(String plainText) {
        return cipher.encrypt(plainText);
    }
}
