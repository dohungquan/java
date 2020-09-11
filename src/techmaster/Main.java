package techmaster;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Date c = new Date();
        System.out.println(String.format("%tY年 %tm月 %td日", c, c, c));
        // 結果：2020年 01月 04日
        System.out.println(String.format("%tH時 %tM分 %tS秒", c, c, c));
        // 結果：14時 23分 36秒

        String str = "samples";
        System.out.println(String.format("値は「%10s」です。", str));
        // 結果：値は「   samples」です。
        System.out.println(String.format("値は「%-10s」です。", str));
        // 結果：値は「samples   」です。
        System.out.println(String.format("値は「%.2s」です。", str));
        // 結果：値は「sa」です。

        double num = 1.23456;
        System.out.println(String.format("値は「%e」です。", num));
        // 結果：値は「1.234560e+00」です。
        System.out.println(String.format("値は「%E」です。", num));
        // 結果：値は「1.234560E+00」です。
        System.out.println(String.format("値は「%f」です。", num));
        // 結果：値は「1.234560」です。
        System.out.println(String.format("値は「%.3f」です。", num));
        // 結果：値は「1.235」です。
    }
}
