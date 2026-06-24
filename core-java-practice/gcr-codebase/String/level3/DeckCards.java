public class DeckCards {
    public static void main(String[] args) {
        String suits[] = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String ranks[] = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        String deck[] = new String[52];
        int index = 0;

        for(String suit : suits) {
            for(String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        for(int i=0;i<deck.length;i++) {
            int random = i + (int)(Math.random()*(deck.length-i));

            String temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }

        for(String card : deck)
            System.out.println(card);
    }
}