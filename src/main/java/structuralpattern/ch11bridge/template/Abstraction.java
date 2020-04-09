package structuralpattern.ch11bridge.template;

/**
 * @author coryjia@gmail.com
 * @date 4/8/20 8:57 PM
 */
public abstract class Abstraction {
    protected Implementor impl;

    public void setImpl(Implementor impl) {
        this.impl = impl;
    }

    public abstract void operation();
}
