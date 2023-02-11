package IteratorDesignPattern;

public class AnimalContainer implements IContainer{

  private String animals[] = new String[4];

  AnimalContainer(){
    animals[0] = "dog";
    animals[1] = "cat";
    animals[2] = "monkey";
    animals[3] = "lion";
  }

  @Override
  public IIterator createIterator() {
    AnimalIterator result = new AnimalIterator();
    return result;
  }

  private class AnimalIterator implements IIterator {
    private int position;

    @Override
    public boolean hasNext() {
      if(position < animals.length) return true;
      return false;
    }

    @Override
    public Object next() {
      if(this.hasNext()) return animals[position++];
      return null;
    }
  }
}
