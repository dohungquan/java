package baitap;

import java.util.Random;

public class RandomMonth {

    private int randomnumber;

    public int getRandomnumber() {
        return randomnumber;
    }

    public void setRandomnumber(int randomnumber) {
        this.randomnumber = randomnumber;
    }

    public int CreateNumber(){
        int randomnumber;
        Random random = new Random();
        // create a random number from 1 to 12
        randomnumber = 1 + random.nextInt(12);
        return randomnumber;
    }

    public void DoSomeThing(int randomnumber){
        switch (randomnumber) {
            case 1:
                System.out.println("Tháng này là tháng Một ");
                break;
            case 2:
                System.out.println("Tháng này là tháng Hai");
                break;
            case 3:
                System.out.println("Tháng này là tháng Ba");
                break;
            case 4:
                System.out.println("Tháng này là tháng Tư");
                break;

            case 5:
                System.out.println("Tháng này là tháng Năm");
                break;

            case 6:
                System.out.println("Tháng này là tháng Sáu");
                break;

            case 7:
                System.out.println("Tháng này là tháng Bảy");
                break;

            case 8:
                System.out.println("Tháng này là tháng Tám");
                break;

            case 9:
                System.out.println("Tháng này là tháng Chín");
                break;

            case 10:
                System.out.println("Tháng này là tháng Mười");
                break;

            case 11:
                System.out.println("Tháng này là tháng Mười Một");
                break;

            case 12:
                System.out.println("Tháng này là tháng Mười Hai");
                break;
        }

        }
}
