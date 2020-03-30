package creatationalpattern.ch06abstractfactory.skin;

/**
 * @author : Cory Jia on 11/25/19
 */
public class Client {
    public static void main(String[] args) {
        SkinFactory factory;
        Button button;
        TextField textField;
        ComboBox comboBox;

        factory = XMLUtil.getBean("SpringSkinFactory");
        button = factory.createButton();
        textField = factory.createTextField();
        comboBox = factory.createComboBox();

        button.display();
        textField.display();
        comboBox.display();

    }
}
