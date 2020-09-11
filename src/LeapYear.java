import  java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        //leap year is year (number % 400 == 0) ||
        // (number % 4 == 0) && (number % 100 != 0)
        Scanner input = new Scanner(System.in);
        System.out.println("Input any year : ");
        int year = input.nextInt();
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            System.out.println("Year " + year + " is a leap year");
        }
        else  System.out.println("Year " + year + " is not a leap year");
        System.out.println();


    }


}
