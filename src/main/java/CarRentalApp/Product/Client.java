package CarRentalApp.Product;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        // Entities to create
        // User
        // Location
        // Store
        // Vehicle
        // Reservation
        // Bill
        // Payment
        // Vehicle Inventory Manager


        List<User> userList = addUsers();
        List<Vehicle>vehicles = addVehicles();
        List<Store> stores = addStores(vehicles);

        VehicleRentalSystem rentalSystem = new VehicleRentalSystem(userList,stores);

        // users come to the App
        User user = userList.get(0);

        // get the stores via location

        Location userLocation = new Location("Malad","Mumbai","400097","Maharashtra");
        Store store = rentalSystem.getStore(userLocation);

        VehicleInventory vehicleInventory = new BikeInventoryFactory();
        List<Vehicle> storeVehicles = store.getVehicles(VehicleType.BIKE);

//        // reserving the particular vehicle
//        Reservation reservation = store.createReservation(storeVehicles.get(0),userList.get(0));
//
//        // generate a bill
//        Bill bill =  new Bill(reservation);
//
//        // make payment
//        Payment payment = new Payment();
//        payment.payBill(bill);
//
//
//        // trip Completed,submit the vehicle and close the reservation
//        store.completeReservation();

    }

    private static List<Vehicle> addVehicles() {
        List<Vehicle>vehicles = new ArrayList<>();
        Vehicle vehicle = new Vehicle();
        vehicle.setCc(1);
        vehicle.setCompanyName("Maruti Swift");
        vehicle.setVehicleType(VehicleType.BIKE);

        Vehicle bike = new Vehicle();
        bike.setCc(1);
        bike.setCompanyName("Honda");
        bike.setVehicleType(VehicleType.BIKE);
        vehicles.add(vehicle);
        vehicles.add(bike);
        return vehicles;

    }

    private static List<Store> addStores(List<Vehicle>vehicles) {
        List<Store> stores = new ArrayList<>();
        Store store = new Store();
        store.setVehicles(vehicles,VehicleType.BIKE);
        store.setStoreId(1);
        stores.add(store);
        return stores;
    }

    private static List<User> addUsers() {
        List<User>users = new ArrayList<>();
        User user = new User();
        user.setUserId(1);
        user.setUserName("Pankaj");
        user.setDrivingLicense("Driving License");
        users.add(user);
        return users;
    }
}
