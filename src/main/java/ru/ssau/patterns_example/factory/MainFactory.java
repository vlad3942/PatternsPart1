package ru.ssau.patterns_example.factory;

import ru.ssau.patterns_example.sub_classes.*;

public class MainFactory {
    public static void main(String[] args) {
        System.out.println("----------------------Auto---------------------");
        Transport auto = TestClass.createInstance("BMW", 0);
        if (auto instanceof Auto) {
            System.out.println("Auto");
        }
        try {
            auto.addModel("X5", 6.04);
            auto.addModel("Series 5", 4.25);
            auto.addModel("X3", 4.52);
        } catch (DuplicateModelNameException e) {
            e.printStackTrace();
        }
        double average = TestClass.getAverage(auto);
        System.out.println(auto.getMark() + " models cost average = " + average);
        TestClass.viewAllModels(auto);
        //Moto Factory
        System.out.println("----------------------Moto---------------------");
        TestClass.setTransportFactory(new MotoFactory());
        Transport moto = TestClass.createInstance("Yamaha", 0);
        if (moto instanceof Moto) {
            System.out.println("Moto");
        }
        try {
            moto.addModel("MT-03", 0.519);
            moto.addModel("MT-07", 0.78);
            moto.addModel("MT-10 SP", 1.617);
        } catch (DuplicateModelNameException e) {
            e.printStackTrace();
        }
        average = TestClass.getAverage(moto);
        System.out.println(moto.getMark() + " models cost average = " + average);
        TestClass.viewAllModels(moto);
    }
}
