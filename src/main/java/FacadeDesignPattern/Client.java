package FacadeDesignPattern;

import FacadeDesignPattern.model.User;
import LibraryManagementSystem.Book;

public class Client {
  public static void main(String[] args) {
    User user = new User("Pankaj","Gupta",23);

    // instead of writing the below lines till 23 lines we can refactor this and create a new class BookingFacade and movie this
    // content there and simply create a method there called createBooking and call that method from here

    /*

    TicketSystem ts = new TicketSystem();
    boolean isBookingPossible = ts.validateAvailability("movie");
    if(isBookingPossible){
      ts.createTicket(100,user,"movie");

      PaymentSystem ps = new PaymentSystem();
      ps.chargeCard();

      NoticationSystem ns = new NoticationSystem();
      ns.sendMail(user,ts.getTicketNumber());
      ns.sendSms(user,ts.getTicketNumber());
    }

    */


    /*
    // Facade Vs Proxy design pattern

    Client --> Proxy --> Actual Object

//    1.Proxy it is only for the specific interface that it implements . it will only take care of
interface that it implements in this case Emp. it will not take care of orderDto
      2.Ex - EmpDao<interface>
              /     \
             /       \
             EmpDto <--EmpDtoProxy

             EmpDtoProxy implements and calls EmpDto method
       3 Whereas FacadeDesign Pattern
       Client --> Facade --> Actual Object

       Facade it take care of multiple object a specific object
       Ex. if you see ex of movie --> it contains Payment object,Notification,Ticket

    */

//    Using Facade Design Pattern
    BookingFacade bookingFacade = new BookingFacade();
    bookingFacade.createBooking(user);

  }

}
