package patterns.creationalPatterns.builder.builder;

import patterns.creationalPatterns.builder.product.Manual;

public class ManualBuilder implements Builder{
    Manual manual = new Manual();

    public ManualBuilder(){
        this.reset();
    }
    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setWheels(boolean b) {
        manual.setWheels(true);
    }

    @Override
    public void setBreaks(boolean b) {
    }

    public Manual GetResult(){
        return this.manual;
    }
}
