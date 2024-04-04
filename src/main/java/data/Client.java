package data;

<<<<<<< HEAD
public class Client {
}
=======
import bank.Card;

public class Client {
    private final String name;
    private final String surname;
    private Card card;
    public Client(String name, String surname) {
        this.name = name;
        this.surname = surname;
        generateCard();
    }
    private void generateCard() {
        long cardNumber = generateCardNumber();
        this.card = new Card(cardNumber);
    }
    private long generateCardNumber() {
        StringBuilder cardNumberBuilder = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            cardNumberBuilder.append(Card.rnd(0, 9));
        }
        return Long.parseLong(cardNumberBuilder.toString());
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public Card getCard() {
        return card;
    }
    public static void main(String[] args) {
        Client client = new Client("Alexey", "Lavrov");
        System.out.println("Client Name: " + client.getName());
        System.out.println("Client Surname: " + client.getSurname());
        System.out.println("Card Number: " + client.getCard().getCARD_NUMBER());
        System.out.println("PIN: " + client.getCard().getPinCode());
    }
}


>>>>>>> 96a13fe (1212)
