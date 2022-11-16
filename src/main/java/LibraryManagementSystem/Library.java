package LibraryManagementSystem;

import java.util.List;

public class Library {
  int libraryId;
  Address address;
  List<Book>books;

  public int getLibraryId() {
    return libraryId;
  }

  public void setLibraryId(int libraryId) {
    this.libraryId = libraryId;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public List<Book> getBooks() {
    return books;
  }

  public void setBooks(List<Book> books) {
    this.books = books;
  }
}
