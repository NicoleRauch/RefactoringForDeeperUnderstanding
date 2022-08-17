package src_2;

public class Percent {

    private double percent;

    public Percent(double percent) {
        if(percent < 0){
            throw new IllegalArgumentException("Negative percentages are not allowed!");
        }

        this.percent = percent;
    }

    public double value() {
        return percent;
    }
}
