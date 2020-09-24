package baitap;

public class Ex4 {
    public static void main(String[] args) {
        Triangle tamgiac = new Triangle();
        double a = tamgiac.Inputabc("Nhap vao canh a : ", "Nhap vao canh a > 0 !!!");
        double b = tamgiac.Inputabc("Nhap vao canh b : ", "Nhap vao canh b > 0 !!!");
        double c = tamgiac.Inputabc("Nhap vao canh c : ", "Nhap vao canh c > 0 !!!");
        tamgiac.setA(a);
        tamgiac.setB(b);
        tamgiac.setC(c);
        tamgiac.TestTriangle(tamgiac.getA(),tamgiac.getB(),tamgiac.getC());

    }
}
