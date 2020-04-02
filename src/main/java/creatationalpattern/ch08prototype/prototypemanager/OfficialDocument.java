package creatationalpattern.ch08prototype.prototypemanager;

/**
 * @author coryjia@gmail.com
 * @date 4/2/20 10:26 AM
 */
public interface OfficialDocument extends Cloneable{
    public OfficialDocument clone();
    public void display();
}
