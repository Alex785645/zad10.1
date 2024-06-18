public class Parallelogram implements Figure {
    private double base;
    private double site;
    private double height;

    public Parallelogram(double base, double site, double height) {
        this.base = base;
        this.site = site;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (base + site);
    }

    @Override
    public double getArea() {
        return base * height;
    }

    @Override
    public String getType() {
        return "Parallelogram";
    }
}
