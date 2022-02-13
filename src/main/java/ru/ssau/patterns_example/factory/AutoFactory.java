package ru.ssau.patterns_example.factory;

import ru.ssau.patterns_example.sub_classes.Auto;
import ru.ssau.patterns_example.sub_classes.Transport;

public class AutoFactory implements TransportFactory {

    @Override
    public Transport createInstance(String mark, int numberOfModels) {
        return new Auto(mark, numberOfModels);
    }
}
