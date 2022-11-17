package DesignVendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VMachine {
  Inventory inventory;
  State vendingMachineState;
  List<Coin> coinList;


  public VMachine() {
    this.vendingMachineState = new IdleState();
    coinList = new ArrayList<>();
    inventory = new Inventory(10);
  }


  public List<Coin> getCoinList() {
    return coinList;
  }

  public void setCoinList(List<Coin> coinList) {
    this.coinList = coinList;
  }

  public Inventory getInventory() {
    return inventory;
  }

  public void setInventory(Inventory inventory) {
    this.inventory = inventory;
  }

  public State getVendingMachineState() {
    return vendingMachineState;
  }

  public void setVendingMachineState(State vendingMachineState) {
    this.vendingMachineState = vendingMachineState;
  }
}
