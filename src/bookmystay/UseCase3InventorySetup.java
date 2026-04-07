package bookmystay;

public class UseCase3InventorySetup {

    public static void main(String[] args) {

        System.out.println("Centralized Room Inventory\n");

        // Create inventory
        RoomInventory inventory = new RoomInventory();

        // Display initial inventory
        inventory.displayInventory();

        // Example update
        System.out.println("\nUpdating inventory...\n");
        inventory.updateAvailability("SingleRoom", 4);

        // Display updated inventory
        inventory.displayInventory();
    }
}
