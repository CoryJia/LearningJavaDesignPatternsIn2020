package structuralpattern.ch13decorator.encryption;

/**
 * @author coryjia@gmail.com
 * @date 4/24/20 9:55 AM
 */
public class ComplexCipher extends CipherDecorator {

    public ComplexCipher(Cipher cipher) {
        super(cipher);
    }

    public String encrypt(String plainText){
        String res = super.encrypt(plainText);
        return this.reverse(res);
    }

    private String reverse(String text) {
        StringBuilder sb = new StringBuilder(text);

        return sb.reverse().toString();
    }
}
