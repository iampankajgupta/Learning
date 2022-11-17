package LibraryManagementSystem;

import java.util.List;

public class Author extends Person{
  List<Book> booksPublished;

  public List<Book> getBooksPublished() {
    return booksPublished;
  }

  public void setBooksPublished(List<Book> booksPublished) {
    this.booksPublished = booksPublished;
  }
}
