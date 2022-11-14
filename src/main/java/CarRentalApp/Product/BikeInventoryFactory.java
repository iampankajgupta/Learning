package CarRentalApp.Product;

import java.util.List;
import java.util.stream.Collectors;

public class BikeInventoryFactory extends VehicleInventory{

    public BikeInventoryFactory() {
        System.out.println("Bike Factory Return Bike");
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
