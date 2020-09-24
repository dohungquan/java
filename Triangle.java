package baitap;

import java.util.Scanner;

public class Triangle {
    private double a;
    private double b;
    private double c;
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double Inputabc(String message, String errorMessage) {
        double value;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(message);
            value = scanner.nextDouble();
            if (value > 0) {
                return value;
            }
            System.out.println(errorMessage);
        }
    }
    public void Inputabc(String errorMessage){
        System.out.println(errorMessage);
    }


    public void TestTriangle(double a, double b, double c){
        if (a + b > c && b + c > a && c + a > b) {
            double Perimeter = a + b + c;
            System.out.println("Chu vi tam giác nhận được là : " +Perimeter);
        }
        else
            Inputabc("Hay chay lai chuong trinh");

    }




}
