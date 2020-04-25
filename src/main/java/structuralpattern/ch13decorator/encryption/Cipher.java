package structuralpattern.ch13decorator.encryption;

/**
 * @author coryjia@gmail.com
 * @date 4/24/20 9:49 AM
 */
public interface Cipher {
    public String encrypt(String plainText);
}
