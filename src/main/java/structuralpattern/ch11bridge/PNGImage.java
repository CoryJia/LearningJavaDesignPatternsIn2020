package structuralpattern.ch11bridge;

/**
 * @author coryjia@gmail.com
 * @date 4/8/20 8:13 PM
 */
public class PNGImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + " PNG format.");
    }
}
