package ru.ssau.patterns_example.prototype;

import ru.ssau.patterns_example.sub_classes.*;

public class MainPrototype {
    public static void main(String[] args) {
        System.out.println("Auto:");

        Auto auto = new Auto("BMW", 0);
        try {
            auto.addModel("X5", 6.04);
            auto.addModel("Series 5", 4.25);
            auto.addModel("X3", 4.52);
        } catch (DuplicateModelNameException e) {
            e.printStackTrace();
        }
        System.out.println("Original:");
        System.out.println(auto);
        try {
            Auto autoClone = (Auto) auto.clone();
            System.out.println("Clone:");
            System.out.println(autoClone);
            //test
            if (auto.equals(autoClone)) {
                System.out.println("Clone is uniq object.");
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("Moto:");

        Moto moto = new Moto("Yamaha", 0);
        try {
            moto.addModel("MT-03", 0.519);
            moto.addModel("MT-07", 0.78);
            moto.addModel("MT-10 SP", 1.617);
        } catch (DuplicateModelNameException e) {
            e.printStackTrace();
        }
        System.out.println("Original:");
        System.out.println(moto);
        try {
            Moto motoClone = (Moto) moto.clone();
            System.out.println("Clone:");
            System.out.println(motoClone);
            //test
            if (moto.equals(motoClone)) {
                System.out.println("Clone is uniq object.");
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
