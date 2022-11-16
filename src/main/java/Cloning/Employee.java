package Cloning;

public class Employee implements Cloneable{
    int id ;
    String name;
    String nickName;
    Address address;


    public Employee(int id, String name, String nickName, Address address) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee employee = (Employee) super.clone();
        employee.setAddress((Address) address.clone());
        return employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", address=" + address +
                '}';
    }
}
