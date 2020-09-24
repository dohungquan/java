package baitap;

import java.util.Random;

public class TakeRamdomACard {

    private int randomCard;

    public int getRandomCard() {
        return randomCard;
    }

    public void setRandomCard(int randomCard) {
        this.randomCard = randomCard;
    }

    public int RamdomNumber(){
        int randomCard;
        Random random = new Random(); // or new Random(someSeed);
        randomCard = 1 + random.nextInt(52);
        return randomCard;
    }
    public void GetCard(int randomCard){
        String card;
        if (randomCard % 13 == 0){
            card = "Aco";
        }else if (randomCard % 13 == 12){
            card = "Q";
        }else if (randomCard % 13 == 11){
            card = "J";
        }else if (randomCard % 13 == 1){
            card = "K";
        }else card = Integer.toString(randomCard % 13);

        String cardType;
        if (this.randomCard/13 == 0){
            cardType = "Co";
        }else if (this.randomCard/13 == 1){
            cardType = "Ro";
        }else if (this.randomCard/13 == 2){
            cardType = "Tep";
        }else cardType = "Bich";

        System.out.println("Card taked is : "+ card + " "+cardType);
    }



}
