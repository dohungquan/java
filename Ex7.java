package baitap;

public class Ex7 {
    public static void main(String[] args) {
        IsRectangleGiaonhau test = new IsRectangleGiaonhau();
        double x1 = test.InputValue("Nhap vao toa do truc hoanh cua diem goc toa do hinh chu nhat 1");
        double y1 = test.InputValue("Nhap vao toa do truc tung cua diem goc toa do hinh chu nhat 1");
        double W1 = test.InputValue("Nhap vao chieu dai hinh chu nhat 1");
        double H1 = test.InputValue("Nhap vao chieu rong hinh chu nhat 1");
        double x2 = test.InputValue("Nhap vao toa do truc hoanh cua diem goc toa do hinh chu nhat 2");
        double y2 = test.InputValue("Nhap vao toa do truc tung cua diem goc toa do hinh chu nhat 2");
        double W2 = test.InputValue("Nhap vao chieu dai hinh chu nhat 2");
        double H2 = test.InputValue("Nhap vao chieu rong hinh chu nhat 2");
        
        test.setX1(x1);
        test.setY1(y1);
        test.setW1(W1);
        test.setH1(H1);

        test.setX2(x2);
        test.setY2(y2);
        test.setW2(W2);
        test.setH2(H2);

        test.Test2_Rectangle(test.getX1(),test.getY1(),test.getW1(),test.getH1(),
                             test.getX2(),test.getY2(),test.getW2(),test.getH2());

    }
}
