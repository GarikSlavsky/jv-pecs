package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.Arrays;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private Bulldozer bulldozer = new Bulldozer();
    private Bulldozer bulldozer1 = new Bulldozer();
    private Bulldozer bulldozer2 = new Bulldozer();

    public List<Bulldozer> get() {
        return Arrays.asList(bulldozer, bulldozer1, bulldozer2);
    }
}
