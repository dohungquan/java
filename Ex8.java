package baitap;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        var day = 0;

        var set1 = new  Ex8Method((byte)1);
        var set2 = new  Ex8Method((byte)2);
        var set3 = new  Ex8Method((byte)4);
        var set4 = new  Ex8Method((byte)8);
        var set5 = new  Ex8Method((byte)16);

        System.out.println("Có phải sinh nhật bạn nằm trong set1 ?");
        System.out.println(set1.getSet());
        System.out.println("Chọn 1 nếu đúng và chọn 0 nếu sai : ");
        int answer = input.nextInt();
        if (answer == 1)
            day +=set1.getFirstNumber();

        System.out.println("Có phải sinh nhật bạn nằm trong set2 ?");
        System.out.println(set2.getSet());
        System.out.println("Chọn 1 nếu đúng và chọn 0 nếu sai : ");
        answer = input.nextInt();
        if (answer == 1)
            day +=set2.getFirstNumber();

        System.out.println("Có phải sinh nhật bạn nằm trong set3 ?");
        System.out.println(set3.getSet());
        System.out.println("Chọn 1 nếu đúng và chọn 0 nếu sai : ");
        answer = input.nextInt();
        if (answer == 1)
            day +=set3.getFirstNumber();

        System.out.println("Có phải sinh nhật bạn nằm trong set4 ?");
        System.out.println(set4.getSet());
        System.out.println("Chọn 1 nếu đúng và chọn 0 nếu sai : ");
        answer = input.nextInt();
        if (answer == 1)
            day +=set4.getFirstNumber();

        System.out.println("Có phải sinh nhật bạn nằm trong set5 ?");
        System.out.println(set5.getSet());
        System.out.println("Chọn 1 nếu đúng và chọn 0 nếu sai : ");
        answer = input.nextInt();
        if (answer == 1)
            day +=set5.getFirstNumber();

        System.out.println("Sinh nhật của bạn là ngày "+day+"!");

    }
}
