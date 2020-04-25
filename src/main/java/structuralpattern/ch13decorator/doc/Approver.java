package structuralpattern.ch13decorator.doc;

/**
 * @author coryjia@gmail.com
 * @date 4/12/20 9:45 PM
 */
public class Approver extends Decorator {
    public Approver(Document document) {
        super(document);
    }

    public void approve(){
        System.out.println("This document need to be approved.");
    }
}
