package Sukhmanpreet.Kaur._1228;

//import javax.swing.JOptionPane;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Sukhmanpreet Kaur
 * @date June 5,2021
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)(Math.random()*13+1));
            c.setSuit(Card.SUITS[(int)(Math.random()*3)]);
            magicHand[i]=c;
            
            }

        /* Card userCard = new Card(); 
        userCard.setValue(Integer.parseInt(JOptionPane.showInputDialog("Enter your card Value here")));
        userCard.setSuit(JOptionPane.showInputDialog("Enter your card suit here"));
        
        for(int i=0;i<magicHand.length;i++){
            if((magicHand[i].getValue()+magicHand[i].getSuit()).equals(userCard.getValue()+userCard.getSuit())){
                System.out.println("Your card- "+userCard.getValue()+" "+userCard.getSuit()+" Congratulations! You won");
                break;
               } 
            else {
                if(i==(magicHand.length-1)){
                    System.out.println("Sorry, you lost");}
               }
             }    
        */
        Card luckyCard = new Card();
        luckyCard.setSuit("Spades");
        luckyCard.setValue(1);     
        
        
        for(int i=0;i<magicHand.length;i++){
            if((magicHand[i].getValue()+magicHand[i].getSuit()).equals(luckyCard.getValue()+luckyCard.getSuit())){
                System.out.println("Your card- "+luckyCard.getValue()+" "+luckyCard.getSuit()+" Congratulations! You won");
                break;
               } 
            else {
                if(i==(magicHand.length-1)){
                    System.out.println("Sorry, you lost");}
               }
               
        
                             
        }
    
    }

}
