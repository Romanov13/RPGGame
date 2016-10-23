import java.util.Random;

public class Card{
  private String name;
  private int power;
  private int defence;
  private String element;
  private String[] elementList = {"water", "fire", "air", "earth"};
  private String[] nameList = {"name1", "name2", "name3", "name4", "name5"};
  
   Card(){
   name = nameList[new Random().nextInt(4)];
    power = new Random().nextInt(10);
    defence = new Random().nextInt(10);;
    element = elementList[new Random().nextInt(4)];
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

  public String getElement(){
    return element;
  }
}
