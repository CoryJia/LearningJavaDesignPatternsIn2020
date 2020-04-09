package structuralpattern.ch12composite.filesystem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author coryjia@gmail.com
 * @date 4/9/20 3:02 PM
 */
public class Folder extends AbstractFile {
    private List<AbstractFile> fileList;

    public Folder(String name) {
        super(name);
        fileList = new ArrayList<>();
    }

    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("Start to kill virus for " + name + " " + this.getClass().getSimpleName());
        for (AbstractFile file : fileList) {
            file.killVirus();
        }
    }
}
