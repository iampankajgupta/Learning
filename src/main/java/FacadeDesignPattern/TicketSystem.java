package FacadeDesignPattern;

import FacadeDesignPattern.model.Movie;
import FacadeDesignPattern.model.User;

public class TicketSystem {

  private int ticketNumber;
  private User user;
  private Movie movie;

  public TicketSystem() {
  }

  public TicketSystem(int ticketNumber, User user, Movie movie) {
    this.ticketNumber = ticketNumber;
    this.user = user;
    this.movie = movie;
  }

  public boolean validateAvailability(String movie){
    return true;
  }

  public void createTicket(int ticketNumber, User user, String movie){

  }

  public int getTicketNumber() {
    return ticketNumber;
  }

  public void setTicketNumber(int ticketNumber) {
    this.ticketNumber = ticketNumber;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Movie getMovie() {
    return movie;
  }

  public void setMovie(Movie movie) {
    this.movie = movie;
  }
}
