package streetFighter;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TestClass 
{
	public static Scanner console = new Scanner (System.in);
	//array list of polymorphic fighter objects
	public static ArrayList<Fighter>myFighterArrayList = new ArrayList<Fighter>();
	public static ArrayList<Moves>myMovesArrayList = new ArrayList<Moves>();
	public static void main(String[] args) {
	
	//===================Objects of different fighter types===========================
	BareKnuckleBoxer Carl = new BareKnuckleBoxer(0, "Carl The Jackel Henson", 2.05, 97.5, 0, 39, 0, 9);
	
	ProBoxer Jimmy = new ProBoxer(0, "Jimmy Rock Hands", 1.9, 90.2, 0, 27, 0, 8);
	
	MuaiThai Robbie = new MuaiThai(0, " ", 1.8, 84.0, 0, 24, 0, 8);
	
	Taekwondo Bae = new Taekwondo(0, " ", 1.7, 90.0, 0, 32, 0, 9);
	
	JiuJitsu Jerry = new JiuJitsu(0, " ", 1.9, 81.0, 0, 26, 0, 6);
	
	Judo Damien = new Judo(0, " ", 2.0, 100.00, 0, 40, 0, 9);
	
	//====================An ArrayList with fighter objects=====================================
	Fighter fighter1 = new BareKnuckleBoxer(0, "Carl The Jackel Henson", 2.05, 97.5, 0, 39, 0, 9);
	myFighterArrayList.add(fighter1);
	
	Fighter fighter2 = new ProBoxer(0, "Jimmy Rock Hands", 1.9, 90.2, 0, 27, 0, 8);
	myFighterArrayList.add(fighter2);
	
	Fighter fighter3 = new MuaiThai(0, " ", 1.8, 84.0, 0, 24, 0, 8);
	myFighterArrayList.add(fighter3);
	
	Fighter fighter4 = new Taekwondo(0, " ", 1.7, 90.0, 0, 32, 0, 9);
	myFighterArrayList.add(fighter4);
	
	Fighter fighter5 = new JiuJitsu(0, " ", 1.9, 81.0, 0, 26, 0, 6);
	myFighterArrayList.add(fighter5);
	
	Fighter fighter6 = new Judo(0, " ", 2.0, 100.00, 0, 40, 0, 9);
	myFighterArrayList.add(fighter6);
	
	//========ArrayList with Moves Objects==============
	Moves jab = new Moves(2, "Jab");
	myMovesArrayList.add(jab);
	
	Moves upperCut = new Moves(4, "Upper Cut");
	myMovesArrayList.add(upperCut);
	
	Moves bigRightHand = new Moves(10, "Big Right Hand");
	myMovesArrayList.add(bigRightHand);
	
	Moves hook = new Moves(4, "Hook");
	myMovesArrayList.add(hook);
	
	Moves roundHouseKick = new Moves(6, "Round House Kick");
	myMovesArrayList.add(roundHouseKick);
	
	Moves legKick = new Moves(6, "Leg Kick");
	myMovesArrayList.add(legKick);
	
	Moves armBar = new Moves(9, "Arm Bar");
	myMovesArrayList.add(armBar);
	
	Moves legLock = new Moves(7, "Leg Lock");
	myMovesArrayList.add(legLock);
	
	Moves kneeToHead = new Moves(12, "Knee To Head");
	myMovesArrayList.add(kneeToHead);
	
	//===========================================================================================
		int i;
		int compChoice = 0;
		int playerMoveChoice  = 0;
		int compMoveChoice = 0;
		int userChoice;
		int gameLength = 10;
		int gameEnder = 0;
		int plaHealthReducer =0; 
		int comHealthReducer = 0;
		int moveChoice =0;
		int playerMoveValue = 0;
		int playerHealth = 0;
		String moveName = " ";
		
		System.out.println("========================================================");
		System.out.println("====================STREET FIGHTER======================");
		System.out.println("Welcome to Street Fighter. Where You choose a fighter to");
		System.out.println("fight to the death!!!!");
		System.out.println("1: Play Game");
		System.out.println("2: Game Instructions");
		System.out.println("3: Exit");
		System.out.println("Please select From Menu Above 1 - 3: "  );
		
		userChoice = console.nextInt();
		System.out.println("========================================================");
		
		int playerIndex = 0; 
		switch(userChoice)
		{
			case 1:
				FighterSelection();
				playerIndex = console.nextInt();
				switch(playerIndex)
				{
					case 0:
						Carl.display();
						break;

					case 1:
						Jimmy.display();
						break;

					case 2:
						Robbie.display();
						break;
						
					case 3:
						Bae.display();
						break;
						
					case 4:
						Jerry.display();
						break;
						
					case 5:
						Damien.display();
						break;
						
				}//end case
				break;

			case 2:
				gameInstructions();
				break;
				
			case 3:
				System.out.println("Thank You and Good Bye");
	            System.exit(0);
				break;
				
		}//end case
		
		Fighter player = getFighter(playerIndex);
		Fighter comp = (randomSelection());
		
		Moves compMove = randomCompMoveSelection();
		
		//makes local variables equal to objects values
		int compMoveValue = compMove.getMoveValue();
		int compHealth = comp.calculateOverallHealth();
		
		 playerHealth = player.calculateOverallHealth();
		
		System.out.println(player.getNickName()+" Vs "+comp.getNickName());
		System.out.println("Let's Fight!!!!!!!!!");
		System.out.println("========================================================");
		
		while (gameLength != 0)
		{
			PlayerMoveSelection();
			moveChoice = console.nextInt();
			
			//this is the move selection
			switch(moveChoice)
			{
				case 0:
					playerMoveValue = jab.getMoveValue();
					moveName = jab.getMoveName();
					break;
				case 1:
					playerMoveValue = bigRightHand.getMoveValue();
					moveName = bigRightHand.getMoveName();
					
					break;

				case 2:
					playerMoveValue =hook.getMoveValue();
					moveName = hook.getMoveName();
					break;
					
				case 3:
					playerMoveValue = roundHouseKick.getMoveValue();
					moveName = roundHouseKick.getMoveName();
					break;
					
				case 4:
					playerMoveValue = legKick.getMoveValue();
					moveName = legKick.getMoveName();
					break;
					
				case 5:
					playerMoveValue = armBar.getMoveValue();
					moveName = armBar.getMoveName();
					break;
				case 6:
					playerMoveValue = legLock.getMoveValue();
					moveName = legLock.getMoveName();
					break;
					
				case 7:
					playerMoveValue = kneeToHead.getMoveValue();
					moveName = kneeToHead.getMoveName();
					break;
				case 8:
					playerMoveValue = upperCut.getMoveValue();
					moveName = upperCut.getMoveName();
					break;
			}//end case
			
			
			for(i = 0;i <= 10; i++ );
			{
				compMove = randomCompMoveSelection();
				compMoveValue =compMove.getMoveValue();
				
				System.out.println(compMoveValue);
				if(playerMoveValue > compMoveValue)
				{
					comHealthReducer = playerMoveValue - compMoveValue ;
					compHealth -= comHealthReducer;
				}
				else if (compMoveValue > playerMoveValue)
				{
					plaHealthReducer = compMoveValue - playerMoveValue;
					playerHealth -= comHealthReducer;
				}
				comHealthReducer = 0;
				plaHealthReducer = 0;
			}//end for
			if(playerHealth == gameEnder)
			{
				System.out.println("TKO!!! CompPlayer wins ");
				break;
			}
			else if (compHealth == gameEnder)
			{
				System.out.println("TKO!!! Player 1 wins ");
				break;
			}
			System.out.println("///////////////////");
			System.out.println(moveName);
			System.out.println("///////////////////");
			gameLength--;
		}//while
		
		System.out.println("==========================================");
		System.out.println("Player 1 Health "+ playerHealth+" vs " +" CompPlayer Health "+ compHealth);
		
		if(playerHealth > compHealth)
		{
			System.out.println("Winner!!! Player 1 wins ");
		}
		else if(compHealth >playerHealth)
		{
			System.out.println("Winner!!! CompPLayer wins ");
		}
		else
			System.out.println("It's A Draw!!! ");
	}//end main
	
	//uses the playerIndex from the switch statement to select fighter from array.
	public static  Fighter getFighter(int playerIndex)
	{
		return myFighterArrayList.get(playerIndex );
	}
	
	//Random method to select the comp Choice
	public static Fighter randomSelection()
	{
		//generates random from 0-5
		Random randomGenerator = new Random();
		int index = randomGenerator.nextInt(myFighterArrayList.size());
		Fighter randNO = myFighterArrayList.get(index);
		return myFighterArrayList.get(index);
	}
	
	//Select random move for 
	
	public static  Moves randomCompMoveSelection()
	{
		Random randomGenerator = new Random();
		int index = randomGenerator.nextInt(myMovesArrayList.size());
		Moves randNO = myMovesArrayList.get(index);
		return myMovesArrayList.get(index);
	}
	
	
	public static void PlayerMoveSelection()
	{
	
		System.out.println("You Can Choose From 8 Types of Moves");
		System.out.println("0: Jab");
		System.out.println("1: Big Right Hand");
		System.out.println("2: Hook");
		System.out.println("3: Round House Kick");
		System.out.println("4: Leg Kick");
		System.out.println("5: Arm Bar");
		System.out.println("6: Leg Lock");
		System.out.println("7: Tko");
		System.out.println("8: Upper Cut");
		System.out.println("Please select your MOVE 0 - 8: "  );
		System.out.println("========================================================");
	}
	public static void FighterSelection()
	{
		System.out.println("========================================================");
		System.out.println("====================STREET FIGHTER======================");
		System.out.println("You Can Choose From 6 Types of Fighers");
		System.out.println("0: Bare Knucle Boxer");
		System.out.println("1: Pro Boxer");
		System.out.println("2: MuaiThai");
		System.out.println("3: Taekwondo");
		System.out.println("4: JiuJitsu");
		System.out.println("5: Judo");
		System.out.println("Please select your fighter 0 - 5: "  );
		System.out.println("========================================================");
	}
	public static void gameInstructions()
	{
		System.out.println("====================STREET FIGHTER====================");
		System.out.println("Street Fighter is a text based fighting game. ");
		System.out.println("Please select a fighter from the list provided. ");
		System.out.println("When you select a fighter you will then enter the ");
		System.out.println("Fighting arena. In here you will be asked to select ");
		System.out.println("your move. The Computer will randomly select it's  ");
		System.out.println("move and you will battle to the bitter end.  ");
		System.out.println("======================================================");
	}
	
	
}//end test class
