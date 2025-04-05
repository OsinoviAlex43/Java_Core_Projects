public class Pyramid implements Shapes {
    private double s;
    private double h;
    private double vol;

    public Pyramid(double h, double s) {
        this.h = h;
        this.s = s;
    }

    public double getS() {
        return s;
    }

    public double getH() {
        return h;
    }

    @Override
    public double getVolume() {
        vol = h * s * 4 / 3;
        return vol;
    }
}
