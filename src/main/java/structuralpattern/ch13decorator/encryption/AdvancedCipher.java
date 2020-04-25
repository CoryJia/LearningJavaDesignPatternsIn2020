package structuralpattern.ch13decorator.encryption;

/**
 * @author coryjia@gmail.com
 * @date 4/24/20 9:59 AM
 */
public class AdvancedCipher extends CipherDecorator {
    public AdvancedCipher(Cipher cipher) {
        super(cipher);
    }

    public String encrypt(String plainText){
        String res = super.encrypt(plainText);
        return this.mod(res);
    }

    private String mod(String text) {
        StringBuilder sb = new StringBuilder();

        for (char c : text.toCharArray()) {
            c = (char)(c - 13);
            sb.append(c);
        }
        return sb.toString();
    }
}
