package baitap;

public class Ex6 {
    public static void main(String[] args) {
        TakeRamdomACard card1 = new TakeRamdomACard();
//        card1.RamdomNumber();
        card1.setRandomCard(card1.RamdomNumber());
//        card1.getRandomCard();
        card1.GetCard(card1.getRandomCard());
    }
}
