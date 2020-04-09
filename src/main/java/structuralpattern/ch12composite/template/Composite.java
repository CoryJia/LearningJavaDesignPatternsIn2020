package structuralpattern.ch12composite.template;

import java.util.ArrayList;
import java.util.List;

/**
 * @author coryjia@gmail.com
 * @date 4/9/20 2:49 PM
 */
public class Composite extends Component{
    private List<Component> list = new ArrayList<>();

    @Override
    public void add(Component c) {
        list.add(c);
    }

    @Override
    public void remove(Component c) {
        list.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return list.get(i);
    }

    @Override
    public void operation() {
        for (Component c : list) {
            c.operation();
        }
    }
}
