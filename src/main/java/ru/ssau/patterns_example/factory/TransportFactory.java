package ru.ssau.patterns_example.factory;

import ru.ssau.patterns_example.sub_classes.Transport;

public interface TransportFactory {
    Transport createInstance(String mark, int numberOfModels);
}
