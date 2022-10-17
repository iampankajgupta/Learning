package AdapterDesignPattern.Client;

import AdapterDesignPattern.Adaptee.WeightMachine;
import AdapterDesignPattern.Adaptee.WeightMachineForBabies;
import AdapterDesignPattern.Adapter.WeightMachineAdapter;
import AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;

import java.util.Iterator;

public class Client {
  public static void main(String[] args){
    WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
    System.out.println(weightMachineAdapter.getWeightInkg());

  }
}
