package structuralpattern.ch12composite.template;

/**
 * @author coryjia@gmail.com
 * @date 4/9/20 2:44 PM
 */
public class Leaf extends Component {
    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        //叶子构件具体业务方法的实现
    }
}
