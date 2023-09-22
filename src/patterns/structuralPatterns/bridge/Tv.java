package patterns.structuralPatterns.bridge;

public class Tv implements Device{
    private boolean enabled = false;

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void enable() {
        this.enabled = true;
    }

    @Override
    public void disable() {
        this.enabled = false;
    }
}
