package model;

import java.math.BigDecimal;

public abstract class  WithDrawbleAccount extends Account {
  abstract void withDraw(BigDecimal amount);
}
