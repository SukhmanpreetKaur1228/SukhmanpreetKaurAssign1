package Sukhmanpreet.Kaur._1228;

import javax.swing.JOptionPane;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)(Math.random()*13+1));
            c.setSuit(Card.SUITS[(int)(Math.random()*3)]);
            
            }

        Card userCard = new Card(); 
        userCard.setValue(Integer.parseInt(JOptionPane.showInputDialog("Enter your card Value here")));
        userCard.setSuit(JOptionPane.showInputDialog("Enter your card suit here"));
        
        
        
        
        
        
        for(int i=0;i<magicHand.length;i++){
           
            
   
            
        }
    }

}
