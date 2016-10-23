public class RPGGame{

  private ArrayList<Card> deck;
  private ArrayList<Player> players;
  private int numOfPlayers = 2;
  
  public static void main(String[] args){
  RPGGame game = new RPGGame();
    
    game.initiate();
    game.go();
  
  }
  
  public void go(){
  }
  
  public void initiate(){
   for(int i = 0; i<24; i++){
    deck.add(new Card()); 
   }
    for(int i = 0; i<numOfPlayers; i++){
     players.add(new Player("Player " + (i+1)); 
    }
        for(int i=0; i<players.size(); i++){
       for(int x=0; x<4; x++){
         Card c = deck.get(new Random().nextInt(deck.size()));
      players.get(i).addACardc(c);
         deck.remove(c);
     }
        }
      
    
  }
  
}
