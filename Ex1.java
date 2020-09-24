package baitap;

public class Ex1 {
    public static void main(String[] args) {
        LeapYear y = new LeapYear();
        y.setYear(y.Input());
        y.caculate(y.getYear());
    }
}
