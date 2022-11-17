package LibraryManagementSystem;

import LibraryManagementSystem.Enum.BookFormat;
import LibraryManagementSystem.Enum.BookStatus;

import java.util.Date;

public class BookItem extends Book {
  String barcode;
  Date publicationDate;
  BookStatus bookStatus;
  BookFormat bookFormat; // paperback | hardcover | journal
  Rack rackLocation;
  Date issueDate;
}
