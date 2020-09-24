package baitap;
import java.util.Scanner;

public class IsRectangleGiaonhau {
    private double x1,y1,W1,H1,x2,y2,W2,H2;
    int abc;


    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getW1() {
        return W1;
    }

    public void setW1(double w1) {
        W1 = w1;
    }

    public double getH1() {
        return H1;
    }

    public void setH1(double h1) {
        H1 = h1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getW2() {
        return W2;
    }

    public void setW2(double w2) {
        W2 = w2;
    }

    public double getH2() {
        return H2;
    }

    public void setH2(double h2) {
        H2 = h2;
    }

    public double InputValue(String mess){
        Scanner input = new Scanner(System.in);
        System.out.println(mess);
        double value = input.nextDouble();
        return value;
    }

    public void Test2_Rectangle(
            double x1,double y1, double W1, double H1,
            double x2, double y2, double W2, double H2) {
        if ((x1 + W1 >= x2 && x2 + W2 >= x1 && y1 + H1 >= y2 && y2 + H2 >= y1) &&
                !(( x2 + W2 <= x1 + W1 && y2 + H2 <= y1 + H1 && x2 >= x1 && y2 >= y1)
                        ||(( x1 + W1 <= x2 + W2 && y1 + H1 <= y2 + H2 && x1 >= x2 && y1 >= y2)) )){
            System.out.println("Hai hình chữ nhật giao nhau");
        }

        if (!(x1 + W1 >= x2 && x2 + W2 >= x1 && y1 + H1 >= y2 && y2 + H2 >= y1)){
            System.out.println("Hai hình chữ nhật không giao nhau");
        }

        if (( x2 + W2 <= x1 + W1 && y2 + H2 <= y1 + H1 && x2 >= x1 && y2 >= y1)
                ||(( x1 + W1 <= x2 + W2 && y1 + H1 <= y2 + H2 && x1 >= x2 && y1 >= y2)) ){
            System.out.println("Hai hình chữ nhật lồng nhau");
        }

    }


}
