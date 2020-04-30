package structuralpattern.ch14facade.template;

/**
 * @author coryjia@gmail.com
 * @date 4/28/20 10:57 PM
 */
public class Facade {
    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();
    private SubSystemC subSystemC = new SubSystemC();

    public void method(){
        subSystemA.methodA();
        subSystemB.methodB();
        subSystemC.methodC();
    }
}
