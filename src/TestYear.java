import java.util.Scanner;
public class TestYear {
    public static void main(String[] args) {
        //test year is
        //What is the zodiac year of the lunar calendar?


        int num;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập vào một số bất kỳ từ 0 - 11 : ");
            System.out.println();
            num = scanner.nextInt();
            if (num >= 0 && num <= 11) {
                break;
            }
            System.out.println("Hãy nhập lại một số từ 0 - 11 !!!");
        }


        if (num == 0){
            System.out.println("Năm nhập vào theo lịch âm là năm : Tý");
        }
        else if (num == 1)
            System.out.println("Năm nhập vào theo lịch âm là năm : Sửu");
        else if (num == 2)
            System.out.println("Năm nhập vào theo lịch âm là năm : Dần");
        else if (num == 3)
            System.out.println("Năm nhập vào theo lịch âm là năm : Mão");
        else if (num == 4)
            System.out.println("Năm nhập vào theo lịch âm là năm : Thìn");
        else if (num == 5)
            System.out.println("Năm nhập vào theo lịch âm là năm : Tỵ");
        else if (num == 6)
            System.out.println("Năm nhập vào theo lịch âm là năm : Ngọ");
        else if (num == 7)
            System.out.println("Năm nhập vào theo lịch âm là năm : Mùi");
        else if (num == 8)
            System.out.println("Năm nhập vào theo lịch âm là năm : Thân");
        else if (num == 9)
            System.out.println("Năm nhập vào theo lịch âm là năm : Dậu");
        else if (num == 10)
            System.out.println("Năm nhập vào theo lịch âm là năm : Tuất");
        else if (num == 11)
            System.out.println("Năm nhập vào theo lịch âm là năm : Hợi");

    }
}
