package CarRentalApp.Product;

public class InventoryFactory {
    public static VehicleInventory getVehicleFactory(VehicleType vehicleType){
        if(vehicleType.toString().equals("CAR")){
            return new CarInventoryFactory();
        }else if(vehicleType.toString().equals("BIKE")){
            return new BikeInventoryFactory();
        }
        return null;
    }
}
