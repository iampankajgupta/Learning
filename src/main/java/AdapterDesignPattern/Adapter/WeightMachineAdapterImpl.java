package AdapterDesignPattern.Adapter;

import AdapterDesignPattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {

  WeightMachine weightMachine;

  public WeightMachineAdapterImpl(WeightMachine weightMachine) {
    this.weightMachine = weightMachine;
  }

  @Override
  public double getWeightInkg() {
    double weightInPounds = weightMachine.getWeightInPounds();
    return weightInPounds * .45;
  }
}
