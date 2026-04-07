package bookmystay;

public class UseCase6RoomAllocation {

    public static void main(String[] args) {

        System.out.println("Room Allocation Processing");

        // Step 1: Create inventory
        RoomInventory inventory = new RoomInventory();

        // Step 2: Create queue
        BookingRequestQueue queue = new BookingRequestQueue();

        // Step 3: Add booking requests
        queue.addRequest(new Reservation("Abhi", "SingleRoom"));
        queue.addRequest(new Reservation("Subha", "SingleRoom"));
        queue.addRequest(new Reservation("Vanmathi", "SuiteRoom"));

        // Step 4: Allocation service
        RoomAllocationService service = new RoomAllocationService();

        // Step 5: Process queue
        while (queue.hasPendingRequests()) {
            Reservation r = queue.getNextRequest();
            service.allocateRoom(r, inventory);
        }
    }
}