package DesignVendingMachine;

import java.util.List;

public class IdleState implements State{

  public IdleState(VMachine machine) {
    System.out.println("Currently Vending Machine is in the idle state");
  }

  public IdleState() {
    System.out.println("Currently Vending Machine is in the idle state");
  }

  // in the idle state we can only click on insert button nothing else we can do
  @Override
  public void clickOnInsertCoinButton(VMachine machine) throws Exception {
    // as soon as we click on insert button we have to change the state from idle --> Has Money State
    machine.setVendingMachineState(new HasMoneyState());
  }

  @Override
  public void insertCoin(VMachine machine, Coin coin) throws Exception {
    throw new Exception("In Idle State You cannot insert a coin");
  }

  @Override
  public void clickOnStartSelectionProductButton(VMachine machine) throws Exception {
    throw new Exception("Product Selection Cannot be made in the idle state");
  }

  @Override
  public void chooseProduct(VMachine machine, int codeNumber) throws Exception {
    throw new Exception("Choose Product Cannot be made in the idle state");
  }

  @Override
  public int getChange(int returnChangeMoney) {
    return 0;
  }

  @Override
  public Item dispenseProduct(VMachine machine, int codeNumber) {
    return null;
  }

  @Override
  public List<Coin> refundFullMoney(VMachine machine) {
    return null;
  }

  @Override
  public void updateInventory(VMachine machine, Item item, int codeNumber) {

  }
}
