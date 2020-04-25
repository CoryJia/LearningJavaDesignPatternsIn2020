package structuralpattern.ch13decorator.encryption;

/**
 * @author coryjia@gmail.com
 * @date 4/24/20 9:51 AM
 */
public class SimpleCipher implements Cipher {
    @Override
    public String encrypt(String plainText) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);

            if(c >= 'a' && c <='z'){
                c += 6;
                if(c > 'z') c = 26;
                if(c < 'a') c += 26;
            }

            if(c >= 'A' && c <= 'Z'){
                c += 6;
                if(c > 'Z') c = 26;
                if(c < 'A') c += 26;
            }
            sb.append(c);
        }

        return sb.toString();
    }
}
