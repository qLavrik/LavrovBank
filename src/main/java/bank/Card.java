package bank;

public class Card {
    private final long CARD_NUMBER;
<<<<<<< HEAD

    private int pinCode;

    public Card (long CARD_NUMBER){
        this.CARD_NUMBER = CARD_NUMBER;
        generatePinCode();
    }
    private void generatePinCode(){
        StringBuilder generatingPin = new StringBuilder();
        for (int i=0;i<4;i++){
            generatingPin.append(rnd(0, 9));
        }
        pinCode = Integer.parseInt(generatingPin.toString());
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
=======
    private String pinCode;

    public Card(long CARD_NUMBER) {
        this.CARD_NUMBER = CARD_NUMBER;
        generatePinCode();
    }

    private void generatePinCode() {
        StringBuilder generatingPin = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            generatingPin.append(rnd(0, 9));
        }
        pinCode = String.valueOf(Integer.parseInt(generatingPin.toString()));
>>>>>>> 96a13fe (1212)
    }

    public long getCARD_NUMBER() {
        return CARD_NUMBER;
    }
<<<<<<< HEAD
    public static int rnd(int min, int max){
        max -= min;
        return (int) (Math.random()* ++max) + min;
=======

    public String getPinCode() {
        return pinCode;
    }

    public static void main(String[] args) {
        Card firstCard = new Card(2208560858093670L);
        System.out.println("Card Number: " + firstCard.getCARD_NUMBER());
        System.out.println("PIN: " + firstCard.getPinCode());
    }

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
>>>>>>> 96a13fe (1212)
    }
}
