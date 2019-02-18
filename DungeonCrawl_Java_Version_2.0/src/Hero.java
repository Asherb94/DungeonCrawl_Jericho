public class Hero {
	  public static int hitPoints;
	  public static int maxHitPoints;
	  public static int strength;
	  public static int maxStrength;
	  public static int potions;
	  public static int gold;
	  public static int intelligence;
	  public static String name;
	  public static int key;
	  
	  public Hero(String name, int hitPoints, int strength, int gold, int key){
		  this.name = name;
		  this.hitPoints = hitPoints;
		  this.maxHitPoints = hitPoints;
		  this.strength = strength;
		  this.maxStrength = strength;
		  this.gold = gold;
		  this.intelligence = 0;
		  this.key = 0;
		  
	  }
	  

	public void Summary(){
		  System.out.println("Hero " + name +": " + Hero.hitPoints + "/" 
				  + this.maxHitPoints + "HP; " + this.strength + "/" + this.maxStrength 
				  + " ST; " + this.gold + " Gold " + "Key(s): "+ this.key);
	  }
	
	public static void heroSummary()
	{
		System.out.println((Hero.getName() +": " + Hero.getHitPoints() + "/" 
				  + Hero.getMaxHitPoints() + "HP; " + Hero.getStrength() + "/" + Hero.getMaxStrength() 
				  + " ST; " + Hero.getGold() + " Gold   " + "Key(s) " + Hero.getKey() ));
	}

	public static int getHitPoints() {
		return hitPoints;
	}

	public static void setHitPoints(int hitPoints) {
		Hero.hitPoints = hitPoints;
	}

	public static int getMaxHitPoints() {
		return maxHitPoints;
	}

	public static void setMaxHitPoints(int maxHitPoints) {
		Hero.maxHitPoints = maxHitPoints;
	}

	public static int getStrength() {
		return strength;
	}

	public static void setStrength(int strength) {
		Hero.strength = strength;
	}

	public static int getMaxStrength() {
		return maxStrength;
	}

	public static void setMaxStrength(int maxStrength) {
		Hero.maxStrength = maxStrength;
	}

	public static int getPotions() {
		return potions;
	}

	public static void setPotions(int potions) {
		Hero.potions = potions;
	}

	public static int getGold() {
		return gold;
	}

	public static void setGold(int gold) {
		Hero.gold = gold;
	}
	
	public static String getName(){
		return name;
	}
	
	public static int getIntelligence(){
		return intelligence;
	}
	
	public static void setIntelligence(int intel){
		Hero.intelligence = intel;
	}
	
	public static int getKey(){
		return key;
	}
	
	public static void setKey(int key){
		Hero.key = key;
	}
	  
}