public class Card{
  private String name;
  private int power;
  private int defence;
  private String element;
  
   Card(String cName, int cPower, int cDefence, String cElement){
   name = cName;
    power = cPower;
    defence = cDefence;
    element = cElement;
  }
  
  public String getName(){
    return name;
}
  
  public int getPower(){
    return power;
  }

  public int getDefence(){
    return defence;
  }

  public int getElement(){
    return element;
  }
}
