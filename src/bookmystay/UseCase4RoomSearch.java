package bookmystay;

public class UseCase4RoomSearch {

    public static void main(String[] args) {

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        RoomInventory inventory = new RoomInventory();

        RoomSearchService service = new RoomSearchService();

        service.searchAvailableRooms(
                inventory,
                single,
                doubleRoom,
                suite
        );
    }
}