package FacadeDesignPattern;

import FacadeDesignPattern.model.User;
import LibraryManagementSystem.Book;

public class Client {
  public static void main(String[] args) {
    User user = new User("Pankaj","Gupta",23);

    // instead of writing the below lines till 23 lines we can refactor this and create a new class BookingFacade and movie this
    // content there and simply create a method there called createBooking and call that method from here

//    TicketSystem ts = new TicketSystem();
//    boolean isBookingPossible = ts.validateAvailability("movie");
//    if(isBookingPossible){
//      ts.createTicket(100,user,"movie");
//
//      PaymentSystem ps = new PaymentSystem();
//      ps.chargeCard();
//
//      NoticationSystem ns = new NoticationSystem();
//      ns.sendMail(user,ts.getTicketNumber());
//      ns.sendSms(user,ts.getTicketNumber());
//    }


//    Using Facade Design Pattern
    BookingFacade bookingFacade = new BookingFacade();
    bookingFacade.createBooking(user);

  }

}
