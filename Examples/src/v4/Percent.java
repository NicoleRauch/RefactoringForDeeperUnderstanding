package v4;

public class Percent {

    private final double percent;

    public Percent(double percent) {
        if(percent < 0){
            throw new IllegalArgumentException("Negative percentages are not allowed!");
        }

        this.percent = percent;
    }

    public double asDecimal() { return percent / 100; }
    public double asNominal() { return percent; }
}
