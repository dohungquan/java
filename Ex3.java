package baitap;

public class Ex3 {
    public static void main(String[] args) {
        RandomMonth a = new RandomMonth();
        a.setRandomnumber(a.CreateNumber());
        a.DoSomeThing(a.getRandomnumber());
    }
}
