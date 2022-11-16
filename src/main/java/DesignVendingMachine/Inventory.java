package DesignVendingMachine;

public class Inventory {
  ItemShelf[]itemShelves;

  // to get the initialise the  count of inventory
  // beacause of this we are passing the count
  public Inventory(int itemCount) {
    itemShelves = new ItemShelf[itemCount];
    initialiseEmptyInventory();
  }

  private void initialiseEmptyInventory() {
    int startCode = 101;
    for(int i = 0;i<itemShelves.length;i++){
      ItemShelf itemShelf = new ItemShelf();
      itemShelf.setCode(startCode);
      itemShelf.setSoldOut(true);
      itemShelves[i] = itemShelf;
      startCode++;
    }
  }

  public ItemShelf[] getItemShelves() {
    return itemShelves;
  }

  public void setItemShelves(ItemShelf[] itemShelves) {
    this.itemShelves = itemShelves;
  }

  public void addItem(Item item, int codeNumber) throws Exception {

    for (ItemShelf itemShelf : itemShelves) {
      if (itemShelf.code == codeNumber) {
        if (itemShelf.isSoldOut()) {
          itemShelf.item = item;
          itemShelf.setSoldOut(false);
        } else {
          throw new Exception("already item is present, you can not add item here");
        }
      }
    }
  }


  public Item getItem(int codeNumber) throws Exception {

    for (ItemShelf itemShelf : itemShelves) {
      if (itemShelf.code == codeNumber) {
        if (itemShelf.isSoldOut()) {
          throw new Exception("item already sold out");
        } else {
          return itemShelf.item;
        }
      }
    }
    throw new Exception("Invalid Code");
  }

  public void updateSoldOutItem(int codeNumber){
    for (ItemShelf itemShelf : itemShelves) {
      if (itemShelf.code == codeNumber) {
        itemShelf.setSoldOut(true);
      }
    }
  }



}
