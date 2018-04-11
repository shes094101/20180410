public class Rectangle extends shape{
    public Rectangle(int len,int wid){
            length = len;
            width = wid;
            area = length*width;
            rec++;
    }
    public double getArea() {
        return super.getArea();
    }
    public int getRec() {
        return super.getRec();
    }
}
