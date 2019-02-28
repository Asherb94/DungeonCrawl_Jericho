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
		printWithDelays("\n\t\tYou see a dim light at the end of the indent in the wall. You walk towards the dim light glow. ",TimeUnit.MILLISECONDS, 80);
		printWithDelays("\n\t\tIt’s a door. You open it and step inside.  ",TimeUnit.MILLISECONDS, 80);
		System.out.print("\t  ===============ITEM SHOP================\n");
	     System.out.print("\t ==== [A] sword $5 - ====)------------  ====\n");
	     System.out.print("\t ==== [B] potion 8 -                 ====\n");
	     System.out.print("\t ====                                ====\n");
	     System.out.print("\t ====                                ====\n");
	     System.out.print("\t ====                                ====\n");
	     System.out.print("\t ========================================\n");
	}
	
	public static void printWithDelays(String data, TimeUnit unit, long delay) throws InterruptedException 
	{
	    
		  for (char ch:data.toCharArray()) 
		    {
		        System.out.print(ch);
		        unit.sleep(delay);
		    }
	  }
	
	
	

}
