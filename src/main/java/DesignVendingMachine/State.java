package DesignVendingMachine;

import java.util.List;

public interface State {

  public void clickOnInsertCoinButton(VMachine machine) throws Exception;

  public void clickOnStartSelectionProductButton(VMachine machine) throws Exception;

  public void insertCoin(VMachine machine,Coin coin) throws Exception;

  public void chooseProduct(VMachine machine,int codeNumber) throws Exception;

  public int getChange(int returnChangeMoney);

  public Item dispenseProduct(VMachine machine,int codeNumber) throws Exception;

  public List<Coin> refundFullMoney(VMachine machine);

  public void updateInventory(VMachine machine,Item item,int codeNumber);




}
