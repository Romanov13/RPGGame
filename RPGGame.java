import java.util.ArrayList;
import java.util.Random;

public class RPGGame{

  private ArrayList<Card> deck = new ArrayList<Card>();
  private int deckSize = 24;
  private int cardsOnTable = 2;
  private ArrayList<Player> players = new ArrayList<Player>();
  private int numOfPlayers = 2;
  boolean defeated = false;
  
  public static void main(String[] args){
  RPGGame game = new RPGGame();
    
    game.initiate();
    game.go();
  
  }
  
  public void go(){
	  while(!defeated){
	  Player first = players.get(new Random().nextInt(players.size()));
	  Player second = players.get(new Random().nextInt(players.size()));
	  while (first.equals(second)){
		  second = players.get(new Random().nextInt(players.size()));
	  }
   round(first, second);
   if(second.getHP()<0){
	   gameOver();
   }
   round(second, first);
   if(first.getHP()<0){
	   gameOver();
   }
   if(deck.size()==0){
	   gameOver();
   }
   Card c1 = deck.get(new Random().nextInt(deck.size()));
   first.addACard(c1);
   deck.remove(c1);
   Card c2 = deck.get(new Random().nextInt(deck.size()));
   second.addACard(c2);
   deck.remove(c2);
   
	  }
  }
  
  public void initiate(){
   for(int i = 0; i<deckSize; i++){
    deck.add(new Card()); 
   }
    for(int i = 0; i<numOfPlayers; i++){
     players.add(new Player("Player " + (i+1))); 
    }
        for(int i=0; i<players.size(); i++){
       for(int x=0; x<4; x++){
         Card c = deck.get(new Random().nextInt(deck.size()));
      players.get(i).addACard(c);
         deck.remove(c);
     }
        }
      
    
  }
                 
                 public void round(Player first, Player second){
  
  Card attack = first.playCard(new Random().nextInt(first.countCards()));
  ArrayList<Card> response = new ArrayList<Card>();
  for(int i = 0; i<second.cardInHand.size(); i++){
	  if(attack.getElement().equals(second.cardInHand.get(i).getElement())){
		  response.add(second.cardInHand.get(i));
	  }
  }
  if(!response.isEmpty()){
	  Card defence = response.get(new Random().nextInt(response.size()));
	  if(attack.getPower()>defence.getDefence()){
		 int damage = attack.getPower() - defence.getDefence();
		 second.reduceHP(damage);
	  }
  } else{
	  second.reduceHP(attack.getPower());
  }
  
     }
               public void  gameOver(){
                	 defeated = true;
                	 System.out.println(players.get(0).getHP());
                	 System.out.println(players.get(1).getHP());
                 }
  
}
