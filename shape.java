public class shape {
    public int length,width,a,b,r,uplong,downlong,height;
    public double area,ang;
    public static int cir,tri,rec,trap,sum;
    public shape(){}

    public int getCir(){
        return cir;
    }
    public int getTrap(){
        return trap;
    }
    public int getTri(){
        return tri;
    }
    public int getRec(){
        return rec;
    }
    public double getArea(){
        return area;
    }
    public int getSum(){
        sum=cir+tri+rec+trap;
        return sum;
    }
    }