package model;

import java.math.BigDecimal;

public class BankingAppWithDrawableService {
  private WithDrawbleAccount withDrawbleAccount;
  public WithDrawbleAccount getWithDrawbleAccount() {
    return withDrawbleAccount;
  }

  public void setWithDrawbleAccount(WithDrawbleAccount withDrawbleAccount) {
    this.withDrawbleAccount = withDrawbleAccount;
  }

  public void withDraw(BigDecimal amount){
    withDrawbleAccount.withDraw(amount);
  }
}
