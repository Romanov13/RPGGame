public class Player{

  private int hp = 20;
  private String name; 
  private ArrayList<Card> cardInHand;
  
  Player(String n){
    name = n;
  }
    public getName(){
    return name;
  }
  public getHP(){
    return hp;
  }
  
  public void addACard(Card){
   cardInHand.add(Card); 
  }
  
  public Card playCard(int i){
    return cardInHand.get(i);
  }
  
  public reduceHP(int d){
    hp = hp - d;
  }
}
