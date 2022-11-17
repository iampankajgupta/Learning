package LibraryManagementSystem;

import LibraryManagementSystem.Enum.BookType;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Search {

  List<BookItem> getBooksByTitle(String title){
    return Arrays.asList(new BookItem());
  }
  List<BookItem> getBooksByAuthors(Author author){
    return Arrays.asList(new BookItem());
  }
  List<BookItem> getBooksByPublishedDate(Date publishDate){
    return Arrays.asList(new BookItem());
  }

  public List<BookItem> getBooksByBookType(BookType bookType){
    return Arrays.asList(new BookItem());
  }
}
