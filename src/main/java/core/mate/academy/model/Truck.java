package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String truckModel;
    private int loadTruckCapacity;

    public Truck() {
    }

    public String getTruckModel() {
        return truckModel;
    }

    public void setTruckModel(String truckModel) {
        this.truckModel = truckModel;
    }

    public int getLoadTruckCapacity() {
        return loadTruckCapacity;
    }

    public void setLoadTruckCapacity(int loadTruckCapacity) {
        this.loadTruckCapacity = loadTruckCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
