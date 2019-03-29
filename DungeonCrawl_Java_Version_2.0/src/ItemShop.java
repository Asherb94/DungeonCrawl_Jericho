import java.util.concurrent.TimeUnit;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class ItemShop {
/*
 * This will be an item shop the user will interact with. 
 * The gold that the user gets during the dungeon will be able to purchase item(s).	
 */
	public ItemShop() throws InterruptedException
	{
		printWithDelays("\n\t\tAs you continue through the mine, you notice an opening on the side of the wall.  ",TimeUnit.MILLISECONDS, 80);
		printWithDelays("\n\t\tYou see a dim light at the end of the indent in the wall. You walk towards the dim lit glow. ",TimeUnit.MILLISECONDS, 80);
		printWithDelays("\n\t\tIt’s a door. You open it and step inside.  ",TimeUnit.MILLISECONDS, 80);
		System.out.println();
		System.out.println();
		System.out.print("\t\t\t\t ================ITEM SHOP===============\n");
	    System.out.print("\t\t\t\t ==== [A] Sword 5 gil    (+2 atk)    ====\n");
	    System.out.print("\t\t\t\t ==== [B] H potion 8 gil (+2 hp)     ====\n");
	    System.out.print("\t\t\t\t ==== [C] S potion 8 gil (+2 stm)    ====\n");
	    System.out.print("\t\t\t\t ==== [D] X potion X gil             ====\n");
	    System.out.print("\t\t\t\t ==== [E] Play Slot                  ====\n");
	    System.out.print("\t\t\t\t ========================================\n");
	    
	    //into to shop keeper
	    System.out.println();
		printWithDelays("\n\t\tAs you continue through the mine, you notice an opening on the side of the wall.  ",TimeUnit.MILLISECONDS, 80);

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
	//slow down text method 
	public static void printWithDelays(String data, TimeUnit unit, long delay) throws InterruptedException 
	{
	    
		  for (char ch:data.toCharArray()) 
		    {
		        System.out.print(ch);
		        unit.sleep(delay);
		    }
	  }
	//to test without running whole game 
	public static void main(String args[]) throws InterruptedException
	{
		ItemShop runitem = new ItemShop();
		
	}
	
	
	

}
