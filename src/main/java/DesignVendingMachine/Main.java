package DesignVendingMachine;

public class Main {
  // This is the Application of State Design Pattern

  public static void main(String[] args) {

    VMachine vendingMachine = new VMachine();
    try{

      System.out.println("|");
      System.out.println("Filing up the Inventory");
      System.out.println("|");

      fillUpInvetory(vendingMachine);
      displayInventory(vendingMachine);

      System.out.println("|");
      System.out.println("Clicking on Insert Coin Button");
      System.out.println("|");

      State vendingState = vendingMachine.getVendingMachineState();
      vendingState.clickOnInsertCoinButton(vendingMachine);

      vendingState = vendingMachine.getVendingMachineState();
      vendingState.insertCoin(vendingMachine,Coin.NICKEL);
      vendingState.insertCoin(vendingMachine,Coin.DIME);

      System.out.println("|");
      System.out.println("Clicking on Product Selection Button");
      System.out.println("|");

      vendingState.clickOnStartSelectionProductButton(vendingMachine);
      vendingState = vendingMachine.getVendingMachineState();
      vendingState.chooseProduct(vendingMachine,102);

      displayInventoryMachine(vendingMachine);

    }catch (Exception e){
      displayInventory(vendingMachine);
    }

  }

  private static void displayInventoryMachine(VMachine vendingMachine) {
  }

  private static void fillUpInvetory(VMachine machine){
    ItemShelf[]slots = machine.getInventory().getItemShelves();
    for(int i = 0;i<slots.length;i++){
      Item item = new Item();
      if(i>=0 && i<3){
        item.setItemType(ItemType.COKE);
        item.setPrice(12);
      }else if(i>=3 && i<=5){
        item.setItemType(ItemType.PEPSI);
        item.setPrice(9);
      }else if(i>=5 && i<=7){
        item.setItemType(ItemType.FANTA);
        item.setPrice(13);
      }else{
        item.setItemType(ItemType.JUICE);
        item.setPrice(7);
      }
      slots[i].setItem(item);
      slots[i].setSoldOut(false);
    }
    machine.getInventory().setItemShelves(slots);
  }

  private static void displayInventory(VMachine vendingMachine){

    ItemShelf[] slots = vendingMachine.getInventory().getItemShelves();
    for (int i = 0; i < slots.length; i++) {

      System.out.println("CodeNumber: " + slots[i].getCode() +
          " Item: " + slots[i].getItem().getItemType().name() +
          " Price: " + slots[i].getItem().getPrice() +
          " isAvailable: " + !slots[i].isSoldOut());
    }
  }

}
