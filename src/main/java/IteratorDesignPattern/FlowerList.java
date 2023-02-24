package IteratorDesignPattern;

import java.util.ArrayList;
import java.util.Arrays;

public class FlowerList implements IContainer{
  ArrayList<String>list = new ArrayList<>(Arrays.asList("Rose","Jasmine","MarieGold","Lavendar"));

  @Override
  public IIterator createIterator() {
    FlowerIterator iterator = new FlowerIterator();
    return iterator;
  }

  private class FlowerIterator implements IIterator{
    private int pos;
    @Override
    public boolean hasNext() {
      if(pos<list.size()) return true;
      return false;
    }

    @Override
    public Object next() {
      if(this.hasNext()) return list.get(pos++);
      return null;
    }
  }
}
