package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private Excavator excavator = new Excavator();
    private Excavator excavator1 = new Excavator();
    private Excavator excavator2 = new Excavator();

    public List<Excavator> get() {
        return Arrays.asList(excavator, excavator1, excavator2);
    }
}
