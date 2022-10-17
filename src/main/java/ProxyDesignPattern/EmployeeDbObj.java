package ProxyDesignPattern;

public interface EmployeeDbObj {

  void create(String client,EmployeeDo obj);
  void delete(String client,int employeeId);
  void getEmployee(String client,int employeeId);


}
