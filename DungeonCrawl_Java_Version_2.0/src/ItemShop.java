import java.util.concurrent.TimeUnit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class ItemShop {
/*
 * This will be an item shop the user will interact with. 
 * The gold that the user gets during the dungeon will be able to purchase item(s).	
 * 
 */
	
	public Hero hero;
	
	public ItemShop() throws InterruptedException, IOException
	{
		int flag = 1;
		
		//printWithDelays("\n\t\tAs you continue through the mine, you notice an opening on the side of the wall.  ",TimeUnit.MILLISECONDS, 80);
		//printWithDelays("\n\t\tYou see a dim light at the end of the indent in the wall. You walk towards the dim lit glow. ",TimeUnit.MILLISECONDS, 80);
		//printWithDelays("\n\t\tIt’s a door. You open it and step inside.  ",TimeUnit.MILLISECONDS, 80);
		printWithDelays("\n\t\t Its an item shop!  ",TimeUnit.MILLISECONDS, 80);

		System.out.println();
		System.out.println();
		System.out.print("\t\t\t\t ==============Snitch's Shop=============\n");
	    System.out.print("\t\t\t\t ==== [A] Sword 5 gil    (+2 atk)    ====\n");
	    System.out.print("\t\t\t\t ==== [B] H potion 8 gil (+2 hp)     ====\n");
	    System.out.print("\t\t\t\t ==== [C] S potion 8 gil (+2 stm)    ====\n");
	    System.out.print("\t\t\t\t ==== [D] X potion X gil             ====\n");
	    System.out.print("\t\t\t\t ==== [E] Play Slot (coming soon)    ====\n");
	    System.out.print("\t\t\t\t ========================================\n");
	    
	    //intro to shop keeper
	    System.out.println();
		printWithDelays("\n\t\t A hunched over pale man is managing the shop.  ",TimeUnit.MILLISECONDS, 80);
		printWithDelays("\n\t\t Snitch - Buy something, heh,  you might need it. \n",TimeUnit.MILLISECONDS, 80);
		
		//User input
		while (flag == 1)
		{
			System.out.println("Type in the letter to buy an item. Type in leave to ya know leave: ");
			BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
			String answer = input.readLine();

			
			//Choices
			if( answer.equalsIgnoreCase("a"))
			{
				if(hero.getGold()< 8)
				{
					System.out.println("Snitch - hehe, seems like you dont have enough gold...");
				}
				else
				{
					hero.setGold(hero.getGold()-8);
					System.out.println("Snitch - hehe, thanks...");
					flag = 0;
				}
			}
			else if ( answer.equalsIgnoreCase("b"))
			{
				if(hero.getGold()< 8)
				{
					System.out.println("Snitch - hehe, seems like you dont have enough gold...");
				}
				else
				{
					hero.setGold(hero.getGold()-8);
					System.out.println("Snitch - hehe, thanks...");
					flag = 0;
				}
			}
			else if ( answer.equalsIgnoreCase("c"))
			{
				if(hero.getGold()< 8)
				{
					System.out.println("Snitch - hehe, seems like you dont have enough gold...");
				}
				else
				{
					hero.setGold(hero.getGold()-8);
					System.out.println("Snitch - hehe, thanks...");
					flag = 0;
				}
			}
			else if( answer.equalsIgnoreCase("d"))
			{
				if(hero.getGold()< 20)
				{
					System.out.println("Snitch - hehe, seems like you dont have enough gold...");
				}
				else
				{
					hero.setGold(hero.getGold()-20);
					System.out.println("Snitch - hehe, thanks...");
					flag = 0;
				}
				
			}
			else 
			{
				if (answer.contentEquals("leave"))  
				{
					System.out.print("\n You levae the item shop.");
					flag = 0;
				}
				
			}
		}
		
		
		
	
		
		
		


	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
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
	public static void main(String args[]) throws InterruptedException, IOException
	{
		ItemShop runitem = new ItemShop();
		
	}
	
	
	

}
