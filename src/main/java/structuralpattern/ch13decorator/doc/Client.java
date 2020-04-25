package structuralpattern.ch13decorator.doc;

/**
 * @author coryjia@gmail.com
 * @date 4/12/20 9:48 PM
 */
public class Client {
    public static void main(String[] args) {
        Document purchaseRequest = new PurchaseRequest();
        Approver approver = new Approver(purchaseRequest);
        approver.display(); //调用原有业务方法
        approver.approve(); //调用新增业务方法


    }
}
