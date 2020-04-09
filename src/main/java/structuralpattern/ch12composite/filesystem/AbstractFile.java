package structuralpattern.ch12composite.filesystem;

/**
 * @author coryjia@gmail.com
 * @date 4/9/20 2:53 PM
 */
public abstract class AbstractFile {
    protected String name;

    public AbstractFile(String name) {
        this.name = name;
    }

    public void add(AbstractFile file){
        System.out.println("Does not support this operation");
    }

    public void remove(AbstractFile file){
        System.out.println("Does not support this operation");
    }

    public AbstractFile getChild(int i){
        System.out.println("Does not support this operation");
        return null;
    }

    public void killVirus() {
        System.out.println("Start to kill virus for " + this.getClass().getSimpleName() + " :"  +name);
    }
//    public abstract void killVirus();
}
