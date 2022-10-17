package ProxyDesignPattern;

public class EmployeeDbObjImpl implements EmployeeDbObj{
  @Override
  public void create(String client, EmployeeDo obj) {
    System.out.println("Created a new Employee");
  }

  @Override
  public void delete(String client, int employeeId) {
    System.out.println("Delete a employee with the provided id.. ");
  }

  @Override
  public void getEmployee(String client, int employeeId) {
    System.out.println("Fetched a employee with the provided id...");
  }
}
