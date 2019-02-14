import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PumpkinScene {
	  //TODO global hero object
    static DungeonCrawl objDungeon = new DungeonCrawl();
	static Hero hero;
	int monsterHit;
	int monsterStr;
	
	// start //
	public PumpkinScene(int monsterHit, int monsterStr) throws IOException, InterruptedException{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("You continue deeper into the mine.");
		System.out.println("The tunnel splits into two passages. Which one do you take? Left or Right? (L or R)");
		//System.out.println();
		
		this.monsterHit = monsterHit;
		this.monsterStr = monsterStr;
		
		//String ans = scan.nextLine();
		String ans = input.readLine();
		if (ans.equals("L") || ans.equals("l"))
			leftChoice();
		
		else
			rightChoice();
	}
	
	private void leftChoice() throws IOException, InterruptedException{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("You see a sign in front of an orange bag: ");
		System.out.println("     Trick or Treat!!!\n\n");
		System.out.println("Do you put a piece of gold in the bag? (y or n)");
		
		//TODO add conditional for if you don't have any gold
		
		//String ans = scan.nextLine();
		String ans = input.readLine();
		if (ans.equals("Y") || ans.equals("y")){
			hero.setGold(hero.getGold()+1);
			System.out.println("Wise choice. You continue down the tunnel.");
		}
		else {
			System.out.println("\nOh no! You have angered the Great Pumpkin!!\n");
			Monster monster = new Monster("Great Pumpkin", monsterHit, monsterStr, 0);
			objDungeon.heroSummary();
			monster.Summary();
			BattleSys sortie = new BattleSys(hero, monster);
		}
	}
	
	private static void rightChoice(){
		System.out.println("You find 10 gold pieces.");
		hero.setGold(hero.getGold()+10);
		objDungeon.heroSummary();
	}
	
	public static void main(String[] args) throws IOException, InterruptedException{
		PumpkinScene sc = new PumpkinScene(5, 4);
	}
}
