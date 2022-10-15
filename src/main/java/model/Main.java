package model;

import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    BankingAppWithDrawableService bankingAppWithDrawableService = new BankingAppWithDrawableService();
    bankingAppWithDrawableService.withDraw(BigDecimal.valueOf(10));

    Account account = new CurrentAcccount();
    account.deposit();
  }
}
