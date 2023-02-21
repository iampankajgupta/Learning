package FacadeDesignPattern;

import FacadeDesignPattern.model.User;

public class BookingFacade {
  public void createBooking(User user){
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
  }

}
