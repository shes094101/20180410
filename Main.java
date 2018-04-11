import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        boolean x = true;
        while (x) { //輸出功能表

            System.out.println("------------------功能表-----------------");
            System.out.println("|              計算圓形請按1            |");
            System.out.println("|              計算矩形請按2            |");
            System.out.println("|             計算三角形請按3           |");
            System.out.println("|              計算梯形請按4            |");
            System.out.println("|              顯示資料請按5            |");
            System.out.println("|                結束請按6              |");
            System.out.println("-----------------------------------------");
            System.out.print("在這裡進行輸入->");
            int s = scn.nextInt();
            switch (s) {
                case 1:
                    System.out.println("您的半徑是?");
                    Circle cir=new Circle(scn.nextInt());
                    System.out.println(cir.getArea());
                    break;
                case 2:
                    System.out.println("您的長度跟寬度是?");
                    Rectangle rec=new Rectangle(scn.nextInt(),scn.nextInt());
                    System.out.println(rec.getArea());
                case 3:
                    System.out.println("您的兩個邊與角度是?");
                    Triangle tri=new Triangle(scn.nextInt(),scn.nextInt(),scn.nextDouble());
                    System.out.println(tri.getArea());
                    break;
                case 4:
                    System.out.println("您的上底和下底與高是?");
                    Trapezoidal tra=new Trapezoidal(scn.nextInt(),scn.nextInt(),scn.nextInt());
                    System.out.println(tra.getArea());
                    break;
                case 6:
                    x = false;
                    System.out.println("感謝您本次使用 歡迎下次使用");
                    break;
                default:
                    System.out.println("請輸入1~6 本系統將自動關閉");
                    x = false;
            }
        }
    }
}