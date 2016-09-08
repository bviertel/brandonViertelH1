//Main class to run the program 
public class rpg {
  
//Main Method
  public static void main(String[] args) {
    
/*-------BASIC ITEM TEST-------*/
    
    //Declaring new 'Item'
    Item gem1 = new Item();
    
    //Set the name and weight of the new item
    gem1.setName("Emerald");
    gem1.setWeight(2);
    
    //Examines the 'gem' item, displaying all relevant stats
    System.out.println(gem1.examine());
    
    /*---MULTI SET BASIC ITEM TEST---*/
    
    Item gem2 = new Item();
    
    gem2.setStats("Opal", 6);
    
    System.out.println(gem2.examine());

/*-------WEAPON TEST-------*/
    
    //Declaring new 'Weapon'
    Weapon sword = new Weapon();
    
    //Initializing all statsof the 'Weapon' (name, weight, damage)
    sword.setName("Excalibur");
    sword.setWeight(10);
    sword.setDamage(10);

    //Examines the 'Weapon' item, displaying all relevant information
    System.out.println(sword.examine());
    
    /*---MULTI SET WEAPON TEST---*/
    
    Weapon hammer = new Weapon();
    
    hammer.setStats("Thor", 6, 10000);
    
    System.out.println(hammer.examine());
    
/*-------ARMOR TEST-------*/
    
    //Declaring new 'Armor'
    Armor shield = new Armor();
    
    //Initializing all stats of the 'Armor' (name, weight, defense)
    shield.setName("Iron Shield");
    shield.setWeight(10);
    shield.setDefense(10);

    //Examines the 'Armor' item, displaying all relevant information
    System.out.println(shield.examine());
    
    /*---MULTI SET ARMOR TEST---*/
    
    Armor legPlate = new Armor();
    
    legPlate.setStats("Leg Plate", 4, 20);
    
    System.out.println(legPlate.examine());
    
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
    
    /*---MULTI SET FOOD TEST---*/
    
    Food taco = new Food();
    
    taco.setStats("Taco", 1, 6, 3);
    
    System.out.println(taco.examine());

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
  
  //Sets the name of the 'Item'
  public void setName(String name) {
    
    this.name = name;
  
  }
  
  //Returns the weight of the 'Item'
  public int getWeight() {
    
    return weight;
  
  }
  
  //Personal Experimentation with setting the name and weight through one method
  //..Does work
  public void setStats(String name, int weight) {
    
    this.name = name;
    this.weight = weight;
  
  }
  
  //Sets the weight of the 'Item'
  public void setWeight(int weight) {
    
    this.weight = weight;
  
  }
  
  //Returns the name and weight of the 'Item' in form of String
  public String examine() {
    
    return String.format("---Item---\nName: %1$s\nWeight: %2$d kg\n", name, weight);
  
  }

}

/*-------WEAPON CLASS-------*/

//Inherits from the 'Item' class
class Weapon extends Item {
  
  //Damage variable of a 'Weapon'
  private int damage;
  
  //Returns the damage of the 'Weapon'
  public int getDamage() {
    
    return damage;
  
  }
  
  //Sets the damage of a 'Weapon'
  public void setDamage(int damage) {
    
    this.damage = damage;
  
  }
  
  //Personal Experimentation with setting the name, weight, and damage through one method
  //..Does work
  public void setStats(String name, int weight, int damage) {
    
    this.name = name;
    this.weight = weight;
    this.damage = damage;
  
  }
  
  //Returns the name, weight, and damage of the 'Weapon' in form of String
  public String examine() {
    
    return String.format("---Weapon---\nName: %1$s\nWeight: %2$d kg\nDamage: %3$d\n", name, weight, damage);
  
  } 
}

/*-------ARMOR CLASS-------*/

//Inherits from 'Item' class
class Armor extends Item {

  //Defense variable of 'Armor'
  private int defense;
  
  //Returns the defense value
  public int getDefense() {
    
    return defense;
  
  }

  //Sets the defense value of the 'Armor'  
  public void setDefense(int defense) {
    
    this.defense = defense;
  
  }
  
  //Personal Experimentation with setting the name, weight, and defense through one method
  //..Does work
  public void setStats(String name, int weight, int defense) {
    
    this.name = name;
    this.weight = weight;
    this.defense = defense;
  
  }

  //Returns the name, weight, and defense of the 'Armor' in form of String  
  public String examine() {
    
    return String.format("---Armor---\nName: %1$s\nWeight: %2$d kg\nDefense: %3$d\n", name, weight, defense);
  
  } 
}

/*-------FOOD CLASS------*/

//Inherits from 'Item' class
class Food extends Item {
  
  //Nutrition variable of 'Food'
  private int nutrition;

  //Quantity variable of 'Food'
  private int quantity;
  
  //Returns the nutition value  
  public int getNutrition() {
    
    return nutrition;
  
  }
  
  //Sets the nutrition value of the 'Food'  
  public void setNutrition(int nutrition) {
    
    this.nutrition = nutrition;
  
  }

  //Returns the quantity value of the 'Food'
  public int getQuantity() {
    
    return quantity;
  
  }
  
  //Sets a new quantity of the 'Food'
  public void setQuantity(int newQuantity) {
    
    this.quantity = newQuantity;
  
  }
  
  //Personal Experimentation with setting the name, weight, nutrition, and quantity through one method
  //..Does work
  public void setStats(String name, int weight, int nutrition, int quantity) {
    
    this.name = name;
    this.weight = weight;
    this.nutrition = nutrition;
    this.quantity = quantity;
  
  }

  //Returns the name, weight, nutrition, and quantity of the 'Food' in form of String
  public String examine() {
    
    return String.format("---Food---\nName: %1$s\nWeight: %2$d kg\nNutrition: %3$d\nQuantity: %4$d\n", name, weight, nutrition, quantity);
  
  } 
}
  

