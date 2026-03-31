package ro.ulbs.proiectaresoftware.advanced;

public class DoubleCalculator extends ACalculator {
    @Override
    public void init(Object value) {
        if (value instanceof Integer) {
            this.state = ((Integer) value).doubleValue();
        } else {
            this.state = (Double) value;
        }
    }

    public DoubleCalculator add(Double value) {
        this.state = (Double) this.state + value;
        return this;
    }

    public DoubleCalculator subtract(Double value) {
        this.state = (Double) this.state - value;
        return this;
    }

    public DoubleCalculator multiply(Double value) {
        this.state = (Double) this.state * value;
        return this;
    }
}
