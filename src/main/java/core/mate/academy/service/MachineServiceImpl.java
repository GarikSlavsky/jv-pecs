package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machines = new ArrayList<>();
        if (type.equals(Excavator.class)) {
            MachineProducer<Excavator> producer = new ExcavatorProducer();
            machines.addAll(producer.get());
        } else if (type.equals(Bulldozer.class)) {
            MachineProducer<Bulldozer> producer = new BulldozerProducer();
            machines.addAll(producer.get());
        } else if (type.equals(Truck.class)) {
            MachineProducer<Truck> producer = new TruckProducer();
            machines.addAll(producer.get());
        }
        return machines;
    }

    public void fill(List<? super Machine> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    public void startWorking(List<? extends T> machines) {
        for (T machine : machines) {
            machine.doWork();
        }
    }
}
