package DesignVendingMachine;

import java.util.List;

public class HasMoneyState implements State{
  // In this State we can only
  // 1. Insert Coin
  // 2. Click on Select Product Button
  // 3. Cancel or getFullRefund
  @Override
  public void clickOnInsertCoinButton(VMachine machine) throws Exception {
    throw new Exception("You cannot click on insert coin button in hasMoneyState");
  }

  // once clicked on Select Product button machine will go to Selection State
  @Override
  public void clickOnStartSelectionProductButton(VMachine machine) {
    machine.setVendingMachineState(new SelectionState());
  }

  @Override
  public void insertCoin(VMachine machine, Coin coin) {
    machine.coinList.add(coin);
  }

  @Override
  public void chooseProduct(VMachine machine, int codeNumber) {

  }

  @Override
  public int getChange(int returnChangeMoney) {
    return returnChangeMoney;
  }

  @Override
  public Item dispenseProduct(VMachine machine, int codeNumber) {
    return null;
  }


  // once clicked on Cancel button machine will go to idle State and money we be refunded
  @Override
  public List<Coin> refundFullMoney(VMachine machine) {
    machine.setVendingMachineState(new IdleState());
    return machine.coinList;
  }

  @Override
  public void updateInventory(VMachine machine, Item item, int codeNumber) {

  }
}
