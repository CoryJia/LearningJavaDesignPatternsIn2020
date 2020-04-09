package structuralpattern.ch11bridge;

import lombok.Setter;

/**
 * @author coryjia@gmail.com
 * @date 4/8/20 8:07 PM
 */

@Setter
public abstract class Image {
    protected  ImageImp imp;

    public abstract void parseFile(String fileName);
}
