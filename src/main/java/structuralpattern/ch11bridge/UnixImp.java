package structuralpattern.ch11bridge;

/**
 * @author coryjia@gmail.com
 * @date 4/8/20 8:11 PM
 */
public class UnixImp implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("Display image in Unix system.");
    }
}
