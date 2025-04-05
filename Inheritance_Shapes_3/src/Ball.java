public class Ball extends SolidOfRevolution {
    private double vol;
    public Ball(double radius) {
        super(radius);
    }

    @Override
    public double getVolume() {
        vol = (Math.PI * radius * radius * radius * 4 / 3);
        return vol;
    }
}
