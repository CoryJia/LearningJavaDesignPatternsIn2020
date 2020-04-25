package structuralpattern.ch13decorator.doc;

/**
 * @author coryjia@gmail.com
 * @date 4/12/20 9:41 PM
 */
public class Decorator implements Document {

    private Document document;

    public Decorator(Document document) {
        this.document = document;
    }

    @Override
    public void display() {
        document.display();
    }
}
