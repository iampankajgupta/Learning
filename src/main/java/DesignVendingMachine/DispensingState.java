package DesignVendingMachine;

import java.util.List;

public class DispensingState implements State{

  DispensingState(VMachine machine, int codeNumber) throws Exception{

    System.out.println("Currently Vending machine is in DispenseState");
    dispenseProduct(machine, codeNumber);
  }


  @Override
  public void clickOnInsertCoinButton(VMachine machine) throws Exception {

  }

  @Override
  public void clickOnStartSelectionProductButton(VMachine machine) throws Exception {

  }

  @Override
  public void insertCoin(VMachine machine, Coin coin) throws Exception {

  }

  @Override
  public void chooseProduct(VMachine machine, int codeNumber) throws Exception {

  }

  @Override
  public int getChange(int returnChangeMoney) {
    return 0;
  }

  @Override
  public Item dispenseProduct(VMachine machine, int codeNumber) throws Exception {
    System.out.println("Product has been dispensed");
    Item item = machine.getInventory().getItem(codeNumber);
    machine.getInventory().updateSoldOutItem(codeNumber);
    machine.setVendingMachineState(new IdleState());
    return item;
  }

  @Override
  public List<Coin> refundFullMoney(VMachine machine) {
    return null;
  }

  @Override
  public void updateInventory(VMachine machine, Item item, int codeNumber) {

  }
}
