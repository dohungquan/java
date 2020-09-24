package baitap;

import java.util.Scanner;

public class Testpoint {
    //co hinh chu nhat co chieu dai theo truc x : 10,
    // chieu rong theo truc y : 5, tam cua hinh chu nhat co toa do tai (0,0)
    // test mot diem duoc nhap vao co toa do tai (x, y)
    // kiem tra xem nam trong hay nam ngoai hinh chu nhat
    final  double X_RectangleMin = -5.0;
    final double X_RectangleMax = 5.0;
    final double Y_RectangleMin = -2.50;
    final double Y_RectangleMax = 2.50;
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double InputXY(String message){
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        double value = input.nextDouble();
        return value;
    }

    public void TestPointInRectangle(double x, double y){
        if((x >= X_RectangleMin && x <= X_RectangleMax )
                && (y >= Y_RectangleMin && y <= Y_RectangleMax)){
            System.out.println("Điểm nhập vào có tọa độ nằm trong hình chữ nhật ");
        }
        else
            System.out.println("Điểm nhập vào có tọa độ nằm ngoài hình chữ nhật");

    }

}
