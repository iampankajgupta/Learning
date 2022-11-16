package LibraryManagementSystem;

public class BookIssueService {

  FineService fineService;
  BookReservationDetail bookReservationDetail;
  // issue a book

  // this function will help us while issuing a book and renewing a book
  public BookReservationDetail getReservationDetails(BookItem bookItem){
    return new BookReservationDetail();
  }

  public BookReservationDetail updateReservationDetails(BookReservationDetail bookReservationDetail){
    return new BookReservationDetail();
  }

  public BookIssueDetail issueABook(BookItem bookItem,SystemUser user){
    // check first the book Item is not already reserved
    // if not then issue a book else throw already reserve a book
    return new BookIssueDetail();
  }
  // renew a book

  // it will internally the issueABook after doing a basic validation checks
  public BookIssueDetail renewABook(BookItem bookItem,SystemUser systemUser){
    return new BookIssueDetail();
  }

  public void returnABook(BookItem bookItem,SystemUser systemUser){

  }

  // reserve a book
  public BookReservationDetail reserveBook(BookItem bookItem,SystemUser user){
    return new BookReservationDetail();
  }

}
