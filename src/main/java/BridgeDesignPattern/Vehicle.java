package BridgeDesignPattern;

public abstract class Vehicle {

    Workshop workshop;
    WorkShop2 workShop2;

    public Vehicle(Workshop workshop, WorkShop2 workShop2) {
        this.workshop = workshop;
        this.workShop2 = workShop2;
    }

    public abstract void manufacture();

}
