package ru.ssau.patterns_example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Singleton {

    private static Properties properties;

    public static synchronized Properties getProperties() {
        if (properties == null) {
            properties = new Properties();
            try (FileInputStream in = new FileInputStream("application.properties")) {
                properties.load(in);
            } catch (IOException e) {
                throw new IllegalStateException(e);
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
