package DesignVendingMachine;

import java.util.List;

public class SelectionState implements State{
  @Override
  public void clickOnInsertCoinButton(VMachine machine) throws Exception {
    throw new Exception("You cannot click on insert coin button in Selection State");
  }

  @Override
  public void clickOnStartSelectionProductButton(VMachine machine) throws Exception {

  }

  @Override
  public void insertCoin(VMachine machine, Coin coin) throws Exception {

  }

  @Override
  public void chooseProduct(VMachine machine, int codeNumber) throws Exception {
      //1. get item of this codeNumber
    Item item = machine.getInventory().getItem(codeNumber);

    //2. total amount paid by User
    int paidByUser = 0;
    for(Coin coin : machine.getCoinList()){
      paidByUser = paidByUser + coin.value;
    }

    //3. compare product price and amount paid by user
    if(paidByUser < item.getPrice()) {
      System.out.println("Insufficient Amount, Product you selected is for price: " + item.getPrice() + " and you paid: " + paidByUser);
      refundFullMoney(machine);
      throw new Exception("insufficient amount");
    }
    else if(paidByUser >= item.getPrice()) {

      if(paidByUser > item.getPrice()) {
        getChange(paidByUser-item.getPrice());
      }
      machine.setVendingMachineState(new DispensingState(machine, codeNumber));
    }

  }

  @Override
  public int getChange(int returnChangeMoney) {
    return returnChangeMoney;
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
