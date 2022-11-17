package LibraryManagementSystem;

public class Librarian extends Person{


  Search searchObj;
  BookIssueService bookIssueService;


  // below are the Use cases that librarian can perform

  // search books from the catalog

  // add books
  public void addBookItem(BookItem book){
  }
  // remove books
  public BookItem deleteBookItem(String barcode){
    return new BookItem();
  }
  // update books

  public BookItem updateBook(BookItem bookItem){
    return new BookItem();
  }
}
