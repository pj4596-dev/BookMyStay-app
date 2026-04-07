package bookmystay;

public class UseCase7AddOnServiceSelection {

    public static void main(String[] args) {

        System.out.println("Add-On Service Selection");

        // Assume reservation already created in UC6
        String reservationId = "SingleRoom-1";

        // Create manager
        AddOnServiceManager manager = new AddOnServiceManager();

        // Create services
        AddOnService breakfast = new AddOnService("Breakfast", 500.0);
        AddOnService spa = new AddOnService("Spa", 1000.0);

        // Add services
        manager.addService(reservationId, breakfast);
        manager.addService(reservationId, spa);

        // Calculate total cost
        double totalCost = manager.calculateTotalServiceCost(reservationId);

        // Output
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Total Add-On Cost: " + totalCost);
    }
}