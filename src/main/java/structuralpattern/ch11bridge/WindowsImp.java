package structuralpattern.ch11bridge;

/**
 * @author coryjia@gmail.com
 * @date 4/8/20 8:09 PM
 */
public class WindowsImp implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("Display image in Windows system.");
    }
}
