package Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        // Shallow Copy vs Deep Copy

//        1 . if a class has Object type variable and we do a shallow copy and do changes in clone object then that change will be reflected in the
        // Original Object. but the class has all the variables as Primitive ones and if we do deep copy and it will be similar to
        // Shallow copy

//        2 . if a class a Object type variable then do deep copy
        // To Perform Shallow copy

//        a. First Extend the class with Cloneable interface which is a marker interface that contians no method inside it
//        b. in that class Override clone method

        // To Perform Deep Copy

//        a. Same a first and Second step in Shallow copy
//        b. set the address as clone in the clone method which was defined in that class (Employee) and setting addess as clone method
        // defined in clone method of address

        // Example to Deep cloning

        Address address = new Address("Talao","Mumbai");
        Employee employee = new Employee(1,"Pankaj","Test",address);
        Employee employee1 = (Employee) employee.clone();
        employee1.setId(2);
        employee1.getAddress().setCity("Chennai");
        System.out.println(employee);
        System.out.println(employee1);
    }
}
