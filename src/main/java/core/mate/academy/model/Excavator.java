package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String excavatorModel;
    private int bucketExcavatorCapacity;

    public Excavator() {
    }

    public String getExcavatorModel() {
        return excavatorModel;
    }

    public void setExcavatorModel(String excavatorModel) {
        this.excavatorModel = excavatorModel;
    }

    public int getBucketExcavatorCapacity() {
        return bucketExcavatorCapacity;
    }

    public void setBucketExcavatorCapacity(int bucketExcavatorCapacity) {
        this.bucketExcavatorCapacity = bucketExcavatorCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}




