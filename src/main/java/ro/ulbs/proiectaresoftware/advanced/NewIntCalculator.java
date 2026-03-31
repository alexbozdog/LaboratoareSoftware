package ro.ulbs.proiectaresoftware.advanced;

public class NewIntCalculator extends ACalculator{
    @Override
    public void init(Object value) {
        this.state = (Integer) value;
    }

    public NewIntCalculator add(Integer value) {
        this.state = (Integer) this.state + value;
        return this;
    }

    public NewIntCalculator subtract(Integer value) {
        this.state = (Integer) this.state - value;
        return this;
    }

    public NewIntCalculator multiply(Integer value) {
        this.state = (Integer) this.state * value;
        return this;
    }
}
