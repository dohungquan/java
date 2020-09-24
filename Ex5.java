package baitap;

public class Ex5 {
    public static void main(String[] args) {
        Testpoint point1 = new Testpoint();
        double x = point1.InputXY("Nhập giá trị trục hoành x = ");
        double y = point1.InputXY("Nhập giá trị trục tung y = ");
        point1.setX(x);
        point1.setY(y);
        point1.TestPointInRectangle(point1.getX(),point1.getY());

    }
}
