public class Circle extends shape {
    public Circle(int radius) {
        r = radius;
        area = r * r * Math.PI;
        cir++;
    }
    public double getArea() {
        return super.getArea();
    }
    public int getCir() {
        return super.getCir();
    }
}
