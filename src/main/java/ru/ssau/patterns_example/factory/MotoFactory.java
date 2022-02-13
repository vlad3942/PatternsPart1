package ru.ssau.patterns_example.factory;

import ru.ssau.patterns_example.sub_classes.Moto;
import ru.ssau.patterns_example.sub_classes.Transport;

public class MotoFactory implements TransportFactory {
    @Override
    public Transport createInstance(String mark, int numberOfModels) {
        return new Moto(mark, numberOfModels);
    }
}
