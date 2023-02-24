package IteratorDesignPattern;

public class Client {
  public static void main(String[] args) {
//    AnimalContainer animalContainer = new AnimalContainer();
//    IIterator iterator = animalContainer.createIterator();
//    while(iterator.hasNext()){
//      System.out.println(iterator.next());
//    }

    FlowerList flowerList = new FlowerList();
    IIterator iterator = flowerList.createIterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }
}
