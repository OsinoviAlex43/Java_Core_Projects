public class Cylinder extends SolidOfRevolution {

    protected double height;
    private double vol;
    public double getHeight() {
        return height;
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;

    }

    @Override
    public double getVolume() {
        vol = (Math.PI * radius * radius * height);
        return vol;
    }
}
