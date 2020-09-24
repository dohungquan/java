package baitap;

import java.util.Scanner;

public class LeapYear {
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year =year;
    }

    public void caculate(int year){
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            System.out.println("Year " + year + " is a leap year");
        }
        else  System.out.println("Year " + year + " is not a leap year");
        System.out.println();
    }

    public int Input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Input any year : ");
        year = sc.nextInt();
        return year;
    }


}
