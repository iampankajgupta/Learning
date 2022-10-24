package CarRentalApp.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarInventoryFactory extends VehicleInventory{
    List<Vehicle> vehicles = new ArrayList<>();

    public CarInventoryFactory() {
        System.out.println("Car Factory Return Car");
    }


    @Override
    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    @Override
    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
