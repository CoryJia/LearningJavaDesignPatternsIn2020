package structuralpattern.ch12composite.template;

/**
 * @author coryjia@gmail.com
 * @date 4/9/20 2:33 PM
 */
public abstract class Component {
    public abstract void add(Component c);//增加成员
    public abstract void remove(Component c); //删除成员
    public abstract Component getChild(int i); //获取成员
    public abstract void operation(); //业务方法
}
