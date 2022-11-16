package ChainOfResponsibilityDesignPattern.Example.Logger;

public enum LoggerType {
  INFO(1),
  DEBUG(2),
  ERROR(3);
  int value;

  LoggerType(int value){
    this.value = value;
  }

}
