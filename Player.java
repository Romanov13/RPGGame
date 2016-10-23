import java.util.ArrayList;

public class Player{

  private int hp = 20;
  private String name; 
  ArrayList<Card> cardInHand = new ArrayList<Card>();
  
  Player(String n){
    name = n;
  }
    public String getName(){
    return name;
  }
  public int getHP(){
    return hp;
  }
  
  public void addACard(Card c){
   cardInHand.add(c); 
  }
  
  public Card playCard(int i){
    return cardInHand.get(i);
  }
  
  public void reduceHP(int d){
    hp = hp - d;
  }
  
  public int countCards(){
	  return cardInHand.size();
  }
}
