package patterns.creationalPatterns.builder;

import patterns.creationalPatterns.builder.builder.CarBuilder;
import patterns.creationalPatterns.builder.director.Director;
import patterns.creationalPatterns.builder.product.Car;

public class TestBuilder {

    public void build(){
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        carBuilder = director.BuildCar(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println(car);
    }
}
