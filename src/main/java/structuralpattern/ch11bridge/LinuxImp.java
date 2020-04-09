package structuralpattern.ch11bridge;

/**
 * @author coryjia@gmail.com
 * @date 4/8/20 8:10 PM
 */
public class LinuxImp implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("Display image in Linux System");
    }
}
