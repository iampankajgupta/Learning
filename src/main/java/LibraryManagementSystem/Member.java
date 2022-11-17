package LibraryManagementSystem;

public class Member extends SystemUser{
  int totalBookCheckedOut;

  // both this service are shared between Member and Librarian
  Search searchObj;
  // which contains renewing a book , reserving a book
  BookIssueService bookIssueService;
}
