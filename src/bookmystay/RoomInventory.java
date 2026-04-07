package bookmystay;

import java.util.HashMap;
import java.util.Map;

public class RoomInventory {

    private Map<String, Integer> inventory;

    // Constructor
    public RoomInventory() {
        inventory = new HashMap<>();

        // Initialize availability
        inventory.put("SingleRoom", 5);
        inventory.put("DoubleRoom", 3);
        inventory.put("SuiteRoom", 2);
    }

    // Get availability
    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    // Update availability
    public void updateAvailability(String roomType, int count) {
        inventory.put(roomType, count);
    }

    // Display inventory
    public void displayInventory() {
        System.out.println("Room Inventory:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " Available: " + entry.getValue());
        }
    }
    public java.util.Map<String, Integer> getRoomAvailability() {
        return inventory;
}
}
