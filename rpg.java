//Main class to run the program 
public class rpg {
  
//Main Method
  public static void main(String[] args) {
    
/*-------BASIC ITEM TEST-------*/
    
    //Declaring new 'Item'
    Item gem = new Item();
    
    //Set the name and weight of the new item
    gem.setName("Emerald");
    gem.setWeight(2);
    
    //Examines the 'gem' item, displaying all relevant stats
    System.out.println(gem.examine());

/*-------WEAPON TEST-------*/
    
    //Declaring new 'Weapon'
    Weapon sword = new Weapon();
    
    //Initializing all statsof the 'Weapon' (name, weight, damage)
    sword.setName("Excalibur");
    sword.setWeight(10);
    sword.setDamage(10);

    //Examines the 'Weapon' item, displaying all relevant information
    System.out.println(sword.examine());
    
/*-------ARMOR TEST-------*/
    
    //Declaring new 'Armor'
    Armor shield = new Armor();
    
    //Initializing all stats of the 'Armor' (name, weight, defense)
    shield.setName("Iron Shield");
    shield.setWeight(10);
    shield.setDefense(10);

    //Examines the 'Armor' item, displaying all relevant information
    System.out.println(shield.examine());
    
/*-------FOOD TEST-------*/
    
    //Declaring new 'Food'
    Food cake = new Food();
    
    //Initializing all stats of the 'Food' (name, weight, nutrition, quantity)
    cake.setName("Cake");
    cake.setWeight(2);
    cake.setQuantity(4);
    cake.setNutrition(4);
    
    //Examines the 'Food' item, displaying all relevant information
    System.out.println(cake.examine());
    

  }
}

/*-------MAIN ITEM CLASS-------*/

class Item {
  
  //Declaring a name for every 'Item'
  public String name;
  
  //Declaring a weight for every 'Item'
  public int weight;
  
  //Returns the name of the 'Item'
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
  
//Experimenting with setting the name and weight through one method
  public void setStats(String name, int weight) {
    
    this.name = name;
    this.weight = weight;
  
  }
  
  //Sets the weight of the object
  public void setWeight(int weight) {
    this.weight = weight;
  }
  
  /*Returns the name and weight of the object,
  //which has been converted to a string
  */
  public String examine() {
    
    return String.format("---Item---\nName: %1$s\nWeight: %2$d kg\n", name, weight);
  
  }

}

//Weapon class, which inherits the Object class
class Weapon extends Item {
  
  //Private variable to set the damage, only weapons have damage
  private int damage;
  
  //Returns the damage of the weapon
  public int getDamage() {
    return damage;
  }
  
  //Sets the damage of the weapon
  public void setDamage(int damage) {
    this.damage = damage;
  }
  
    /*Returns the name and weight of the object,
  //which has been converted to a string
  */
  public String examine() {
    
    return String.format("---Weapon---\nName: %1$s\nWeight: %2$d kg\nDamage: %3$d\n", name, weight, damage);
  
  } 
}

//Armor class
class Armor extends Item {

//Private variable to set the defense, only armor has defense
  private int defense;
  
//Returns the defense value
  public int getDefense() {
    return defense;
  }

//Sets the defense value of the armor  
  public void setDefense(int defense) {
    this.defense = defense;
  }

//Displays all armor stats (name, weight, defense)  
  public String examine() {
    
    return String.format("---Armor---\nName: %1$s\nWeight: %2$d kg\nDefense: %3$d\n", name, weight, defense);
  
  } 
}

//Class for items of which are food
class Food extends Item {
  
//Only food has nutrition
  private int nutrition;

//Only food has a quantity
  private int quantity;
  
//Retieves the nutition value  
  public int getNutrition() {
    
    return nutrition;
  
  }
  
//Sets the nutrition value for the food item  
  public void setNutrition(int nutrition) {
    
    this.nutrition = nutrition;
  
  }

//Retrieves the quantity of the food
  public int getQuantity() {
    
    return quantity;
  
  }
  
//Sets the quantity of the food
  public void setQuantity(int newQuantity) {
    
    this.quantity = newQuantity;
  
  }

//Lists all of the details for the food
  public String examine() {
    
    return String.format("---Food---\nName: %1$s\nWeight: %2$d kg\nNutrition: %3$d\nQuantity: %4$d\n", name, weight, nutrition, quantity);
  
  } 
}
  

