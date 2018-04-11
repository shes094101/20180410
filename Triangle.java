public class Triangle extends shape{
    public Triangle(int cos,int tan,double angle){
            a = cos;
            b = tan;
            ang = angle;
            area = a*b*Math.sin(ang);
            tri++;
    }
    public double getArea() {
        return super.getArea();
    }
    public int getTri() {
        return super.getTri();
        }
}
