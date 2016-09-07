
//Class to hold all similar attributes
class Object {
  //Every object has a name
  private String name;
  //Every object has a weight
  private int weight;
  
  //Returns the name of the object
  public String getName() {
    return name;
  }
  
  //Sets the name of the object when called
  public void setName(String name) {
    this.name = name;
  }
  
  //Returns the weight of the object
  public int getWeight() {
    return weight;
  }
  
  //Sets the weight of the object
  public void setWeight(int weight) {
    this.weight = weight;
  }
  
  /*Returns the name and weight of the object,
  //which has been converted to a string
  */
  public String examine() {
    return name + Integer.toString(weight);
  }
}

class Weapon extends Object {
  private int damage;
  
  public int getDamage() {
    return damage;
  }
}

class Armor extends Object {
  private int defense;
  
  public int getDefense() {
    return defense;
  }
}

class Food extends Object {
  private int nutrition;
  private int quantity;
  
  public int getNutrition() {
    return nutrition;
  }
  
  public int getQuantity() {
    return quantity;
  }
  
  public void setQuantity(int newQuantity) {
    this.quantity = newQuantity;
  }
}
  
public class rpg {
  public static void main(String[] args) {
    
    
  }
}

