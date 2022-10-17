package ProxyDesignPattern;

public class EmployeeDbObjProxy implements EmployeeDbObj{

  EmployeeDbObj employeeDbObj;

  public EmployeeDbObjProxy() {
    this.employeeDbObj = new EmployeeDbObjImpl();
  }

  @Override
  public void create(String client, EmployeeDo obj) {
    if(!client.equalsIgnoreCase("ADMIN")){
      throw new RuntimeException("Access Denied");
    }
    employeeDbObj.create(client,obj);
  }

  @Override
  public void delete(String client, int employeeId) {
    if(!client.equalsIgnoreCase("ADMIN")){
      throw new RuntimeException("Access Denied");
    }
    employeeDbObj.delete(client,employeeId);
  }

  @Override
  public void getEmployee(String client, int employeeId) {
    if(!client.equalsIgnoreCase("ADMIN") || !client.equalsIgnoreCase("")){
      throw new RuntimeException("Access Denied");
    }
    employeeDbObj.getEmployee(client,employeeId);
  }
}
