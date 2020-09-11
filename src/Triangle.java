import java.util.Scanner;
public class Triangle {

    public static void main(String[] args) {
        // ba canh tam giac a, b c;
        double a;
        double b;
        double c;

        while (true){
            Scanner input = new Scanner(System.in);
            System.out.println("Nhập độ dài cạnh tam giác a = : ");
            a = input.nextDouble();
            System.out.println("Nhập độ dài cạnh tam giác b = :");
            b = input.nextDouble();
            System.out.println("Nhập độ dài cạnh tam giác c = :");
            c = input.nextDouble();
            if (a + b > c && b + c > a && c + a > b) {
                break;
            }
            System.out.println("Chạy lại chương trình này !!!!!");
        }


        double Perimeter = a + b + c;
        System.out.println("Chu vi tam giác nhận được là : " +Perimeter);

    }

}
