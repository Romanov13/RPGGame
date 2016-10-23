public class Player{

  private int hp;
  private ArrayList<Card> cardInHand;
  
  public getHP(){
    return hp;
  }
  
  public Card playCard(int i){
    return cardInHand.get(i);
  }
}
