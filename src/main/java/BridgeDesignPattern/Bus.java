package BridgeDesignPattern;

public class Bus extends Vehicle{
    public Bus(Workshop workshop, WorkShop2 workShop2) {
        super(workshop, workShop2);
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing ..........");
        workshop.make();
        workShop2.assemble();
    }
}
