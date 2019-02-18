/*
 * @author: Asher, Logan, & Lydia 
 * Last Worked on: 12/3/2017
 */
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DungeonCrawl extends Scenes{
    Monster monster; //The monster object -- constantly updated by the game
	
	private int hitPoints;
	private int strength;
	private String name;
	private int gold;
	
	
	/*public static void heroSummary()
	{
		System.out.println((Hero.getName() +": " + Hero.getHitPoints() + "/" 
				  + Hero.getMaxHitPoints() + "HP; " + Hero.getStrength() + "/" + Hero.getMaxStrength() 
				  + " ST; " + Hero.getGold() + " Gold   " + "Key(s) " + Hero.getKey() ));
		
		
	}*/
	
	public void monsterSummary()
	{
		System.out.println("     Monster: " + Monster.getHitPoints() + Monster.getMaxHitPoints() 
													+ Monster.getStrength() + Monster.getMaxStrength());
	}
	
	public static void pauseProg(){
		System.out.println("\n\n    (Hit Enter)");
	    Scanner keyboard = new Scanner(System.in);
		keyboard.hasNextLine();
	}
	
	
	static void sceneSelect( int scene ) throws IOException, InterruptedException
	{
     //Final Monster Health and Strength 
	  if      ( scene== 0 ) scene00();//1 gold   /* monster-hitpoints, monster-strength  */
	  else if ( scene== 1 )  {BatScene( 1, 1); deathCall();BatScene( 3, 2);} // Bat 2 2
	  else if ( scene== 2 ) PumpkinScene( 4, 4);//Bat 3 3
	  else if ( scene== 3 ) SmallChestScene( 0, 0);// chest 
	  else if ( scene== 4 ) MouseScene( 4, 4);// Mouse 
	  else if ( scene== 5 ) WizardScene( 1, 1);// The Wizard, only exception to rule because of mult monsters in class 
	  else if ( scene== 6 ) BoulderScene( 0, 0); // BoulderScene, makes monster in class 
	  else if ( scene== 7 ) GoldElfScene( 7, 7); // 
	  else if ( scene== 8 ) OldManScene( 7, 10);// Old Man (fight) 
	  else if ( scene== 9 ) WizardRevengeScene( 4, 4);// Revenge (fight) only exception to rule because of mult monsters in class- 4 and 4 for mouse 
	  else if ( scene== 10 ) Moria( );//Monsters in the class 

	  else
	  {
	    System.out.print(" More to come! ");
	  }
	   
  
   }
	
	  public static void printWithDelays(String data, TimeUnit unit, long delay) throws InterruptedException {
		    
		  for (char ch:data.toCharArray()) 
		    {
		        System.out.print(ch);
		        unit.sleep(delay);
		    }
	  }
	  
	  public static void deathCall (){
		  if ( Hero.getHitPoints() <= 0 )
		  {
		    System.out.print("\n\nYou Lose.\n");
		    RIP objRIP = new RIP();
		    objRIP.display();
		    System.exit(0);
		  }
		  
	  }




	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		
		 //printWithDelays("HELLO", TimeUnit.MILLISECONDS, 100);
		
	    int sceneCount = 0;
		Scanner scan = new Scanner(System.in);
		int scene = 0; //starts at the first scene 
		
		//Splash Screen aka Title screen
		Splash objSplash = new Splash();//create obj splash
		Splash.splash();//calls constructor and displays title 
	    
		
		System.out.println("\n\n      (Hit Enter)");
		if (scan.hasNextLine()){
		}
	
		Intro objIntro = new Intro();//where hero is created the frist time..name,health,strength,gold
		objIntro.intro();
		//only runs once ^
		//loops after that below
		while (Hero.getHitPoints() > 0 && scene <= 10)//MAKE SURE TO UPDATE WHILE SCENES ARE BEING ADDED
		{
			
			pauseProg();	
			
			//go to the current scene
			//System.out.println("    ****" + "Scene: "+ (sceneCount++) + " ****    ");
			
			System.out.print(sceneCount++);
			printWithDelays(" *****",TimeUnit.MILLISECONDS, 75);
			//System.out.println();
			sceneSelect(  scene ); 
			scene++;//goes to the next scene 
			
			
			
			 /* If hit points are low, place a magic potion in the Hero's path */
			  if (  Hero.getHitPoints() > 0 && Hero.getHitPoints() < scene/4 +2   ) //
			  {
				  PotionScene objPotion = new PotionScene();
				  PotionScene.potionScene();
			  }
			  
			  /* End of Game Summary */
			  deathCall();
/*			  if ( hero.getHitPoints() <= 0 )
			  {
			    System.out.print("\n\nYou Lose.\n");
			    RIP objRIP = new RIP();
			    objRIP.display();
			  }*/
			  
			  if(scene == 11 && Hero.getHitPoints()>=1)//MAKE SURE TO UPDATE WHILE SCENES ARE BEING ADDED 
			  {
				int finalGold = 0;
			    System.out.print("\n\n  You reach the end of the mine and find 100 pieces of gold\n\n");
			    finalGold = Hero.getGold() + 100;
			    System.out.print("  You now have " + finalGold + " pieces of gold and have WON the game.\n\n");

			  }
			
			
		}

	}

}

