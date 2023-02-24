package AbstractFactoryDesignPattern;

public class WinCheckBox implements CheckBox{
  @Override
  public void paint() {
    System.out.println("Win Checkbox");
  }
}
