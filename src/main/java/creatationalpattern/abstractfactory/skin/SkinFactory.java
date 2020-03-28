package creatationalpattern.abstractfactory.skin;

/**
 * @author : Cory Jia on 11/25/19
 */
public interface SkinFactory {
    public Button createButton();
    public TextField createTextField();
    public ComboBox createComboBox();
}
