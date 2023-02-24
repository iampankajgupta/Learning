package AbstractFactoryDesignPattern;

public class MacUIFactory implements UIFactory{
  @Override
  public Button createButton() {
    return new MacButton();
  }

  @Override
  public CheckBox createCheckBox() {
    return new MacCheckbox();
  }
}
