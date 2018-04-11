public class Trapezoidal extends shape{
    public Trapezoidal(int up,int down,int hei){
            uplong = up;
            downlong = down;
            height = hei;
            area = (uplong + downlong) * height / 2;
            trap++;
        }
    public double getArea() {
        return super.getArea();
    }
    public int getTrap() {
        return super.getTrap();
    }
}