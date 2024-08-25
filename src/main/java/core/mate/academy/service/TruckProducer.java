package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.Arrays;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private Truck truck = new Truck();
    private Truck truck1 = new Truck();
    private Truck truck2 = new Truck();

    public List<Truck> get() {
        return Arrays.asList(truck, truck1, truck2);
    }
}
