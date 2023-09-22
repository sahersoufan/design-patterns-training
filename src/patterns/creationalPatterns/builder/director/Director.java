package patterns.creationalPatterns.builder.director;

import patterns.creationalPatterns.builder.builder.CarBuilder;
import patterns.creationalPatterns.builder.builder.ManualBuilder;

public class Director {

    public CarBuilder BuildCar(CarBuilder builder){
        builder.reset();
        builder.setWheels(true);
        builder.setBreaks(true);
        return builder;
    }

    public ManualBuilder BuildManual(ManualBuilder builder){
        builder.reset();
        builder.setWheels(true);
        return builder;
    }

}
