package model;

<<<<<<< HEAD
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    BankingAppWithDrawableService bankingAppWithDrawableService = new BankingAppWithDrawableService();
    bankingAppWithDrawableService.withDraw(BigDecimal.valueOf(10));

    Account account = new CurrentAcccount();
    account.deposit();
  }
=======
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Calc calc = new Calc();
        System.out.println(calc.calculate(new Addition(2,4)));
        System.out.println(calc.calculate(new Division(10,2)));
    }
>>>>>>> ef4b85da304fca005bab00b4b3a8b89a9f516476
}
