package structuralpattern.ch13decorator.doc;

/**
 * @author coryjia@gmail.com
 * @date 4/12/20 9:47 PM
 */
public class Deleter extends Decorator {
    public Deleter(Document document) {
        super(document);
    }

    public void deleteDoc(){
        System.out.println("Delete the current document.");
    }
}
