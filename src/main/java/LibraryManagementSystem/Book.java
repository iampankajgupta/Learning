package LibraryManagementSystem;

import LibraryManagementSystem.Enum.BookType;

import java.util.List;

public class Book {
  String uniqueId;
  String title;
  String subject;
  List<Author> authors;
  int numberOfPages;
  BookType bookType;

}
