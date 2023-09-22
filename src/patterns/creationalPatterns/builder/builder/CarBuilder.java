package patterns.creationalPatterns.builder.builder;

import patterns.creationalPatterns.builder.product.Car;

public class CarBuilder implements Builder{
    Car car = new Car();

    public CarBuilder(){
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setWheels(boolean b) {
        car.setWheels(b);
    }

    @Override
    public void setBreaks(boolean b) {
        car.setBreaks(b);
    }

    public Car getResult(){
        return this.car;
    }
}
