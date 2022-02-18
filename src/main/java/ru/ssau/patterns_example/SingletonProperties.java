package ru.ssau.patterns_example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class SingletonProperties extends Properties {

    private static volatile SingletonProperties properties;

    private SingletonProperties() {
        super();
    }

    public static SingletonProperties getProperties() {
        if (properties == null) {
            synchronized (SingletonProperties.class) {
                if (properties == null) {
                    properties = new SingletonProperties();
                    try (FileInputStream in = new FileInputStream("application.properties")) {
                        properties.load(in);
                    } catch (IOException e) {
                        throw new IllegalStateException(e);
                    }
                }
            }
        }
        return properties;
    }

    public static void main(String[] args) {
        Properties prop = getProperties();
        for (String key : prop.stringPropertyNames()) {
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }
    }
}
