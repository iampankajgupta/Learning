package ProxyDesignPattern;

public class Client {
  public static void main(String[] args) {
    EmployeeDbObj employeeDbObj = new EmployeeDbObjProxy();
    employeeDbObj.create("ADMIN",new EmployeeDo());

  }
}
