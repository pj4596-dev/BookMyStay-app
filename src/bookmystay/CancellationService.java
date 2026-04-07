package bookmystay;

import java.util.*;

public class CancellationService {

    // Stack for rollback (LIFO)
    private Stack<String> releasedRoomIds;

    // Map reservationId → roomType
    private Map<String, String> reservationRoomTypeMap;

    public CancellationService() {
        releasedRoomIds = new Stack<>();
        reservationRoomTypeMap = new HashMap<>();
    }

    // Register confirmed booking
    public void registerBooking(String reservationId, String roomType) {
        reservationRoomTypeMap.put(reservationId, roomType);
    }

    // Cancel booking
    public void cancelBooking(String reservationId, RoomInventory inventory) {

        // Validate existence
        if (!reservationRoomTypeMap.containsKey(reservationId)) {
            System.out.println("Invalid cancellation: Reservation not found.");
            return;
        }

        String roomType = reservationRoomTypeMap.get(reservationId);

        // Push to stack (rollback history)
        releasedRoomIds.push(reservationId);

        // Restore inventory
        int current = inventory.getAvailability(roomType);
        inventory.updateAvailability(roomType, current + 1);

        // Remove from active bookings
        reservationRoomTypeMap.remove(reservationId);

        System.out.println("Booking cancelled successfully. Inventory restored for room type: " + roomType);
    }

    // Show rollback history
    public void showRollbackHistory() {

        System.out.println("\nRollback History (Most Recent First):");

        for (int i = releasedRoomIds.size() - 1; i >= 0; i--) {
            System.out.println("Released Reservation ID: " + releasedRoomIds.get(i));
        }
    }
}