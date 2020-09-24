package baitap;

import java.util.Scanner;

public class TestYear {
    private byte year;

    public  byte getYear() {
        return year;
    }

    public void setYear(byte year) {
        this.year = year;
    }

    public byte InputYear(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập vào một số bất kỳ từ 0 - 11 : ");
            System.out.println();
            year = scanner.nextByte();
            if (year >= 0 && year <= 11) {
                break;
            }
            System.out.println("Hãy nhập lại một số từ 0 - 11 !!!");
        }

        return year;
    }

    public void HowYear(byte year){
        if (year == 0){
            System.out.println("Năm nhập vào theo lịch âm là năm : Tý");
        }
        else if (year == 1)
            System.out.println("Năm nhập vào theo lịch âm là năm : Sửu");
        else if (year == 2)
            System.out.println("Năm nhập vào theo lịch âm là năm : Dần");
        else if (year == 3)
            System.out.println("Năm nhập vào theo lịch âm là năm : Mão");
        else if (year == 4)
            System.out.println("Năm nhập vào theo lịch âm là năm : Thìn");
        else if (year == 5)
            System.out.println("Năm nhập vào theo lịch âm là năm : Tỵ");
        else if (year == 6)
            System.out.println("Năm nhập vào theo lịch âm là năm : Ngọ");
        else if (year == 7)
            System.out.println("Năm nhập vào theo lịch âm là năm : Mùi");
        else if (year == 8)
            System.out.println("Năm nhập vào theo lịch âm là năm : Thân");
        else if (year == 9)
            System.out.println("Năm nhập vào theo lịch âm là năm : Dậu");
        else if (year == 10)
            System.out.println("Năm nhập vào theo lịch âm là năm : Tuất");
        else if (year == 11)
            System.out.println("Năm nhập vào theo lịch âm là năm : Hợi");

    }
}
