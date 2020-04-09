package structuralpattern.ch11bridge;

/**
 * @author coryjia@gmail.com
 * @date 4/8/20 8:16 PM
 */
public class Client {
    public static void main(String[] args) {
        Image image = new GIFImage();
        ImageImp imp = new WindowsImp();
        image.setImp(imp);
        image.parseFile("Beautiful Rainy!");
    }
}
