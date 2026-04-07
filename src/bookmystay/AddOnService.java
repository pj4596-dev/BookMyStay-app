package bookmystay;

public class AddOnService {

    private String serviceName;
    private double cost;

    // Constructor
    public AddOnService(String serviceName, double cost) {
        this.serviceName = serviceName;
        this.cost = cost;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getCost() {
        return cost;
    }
}