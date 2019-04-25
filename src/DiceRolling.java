import java.util.Random;
import java.util.Scanner;

public class DiceRolling {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String prompt;
		int firstdice, seconddice;
		int countRoll = 1;
		do {
			System.out.println("Welcome to the Grand Circus Casino!");
			System.out.println(" ");
			System.out.println("How many sides should each die have?");
			int sides = scan.nextInt();
			
			//Counter for Roll
			System.out.println("Roll " + countRoll + ":");
			//Method call-generateRandomDieRoll()
			firstdice = generateRandomDieRoll(sides);
			seconddice = generateRandomDieRoll(sides);
						
			System.out.println(firstdice);
			System.out.println(seconddice);
			
			//method call-specialMessage()
			specialMessage(firstdice, seconddice);

			countRoll++;
			
			System.out.println("Roll again?(y/n):");
			prompt = scan.next();
		} while (prompt.equalsIgnoreCase("y"));

		System.out.println("Good bye!");
		scan.close();

	}
	//method Definition
	public static int generateRandomDieRoll(int side) {

		Random rand = new Random();
		int randumnum = rand.nextInt(side) + 1;
		return randumnum;
	}
	
	//Extended Challenge-Special Message
	public static void specialMessage(int firstdice, int seconddice) {
			//if both the dice are 1----->Snake Eyes
		if (firstdice == 1 && seconddice == 1) {
			System.out.println("Great its Snake Eyes");
			//if the sum of pair of dice is 2 or 3 or 12 ---->Craps
		} else if (firstdice + seconddice == 2 || firstdice + seconddice == 3 || firstdice + seconddice == 12) {
			System.out.println("Great it is Craps");
			//if the result is 6 and 6 ---> Box Car
		} else if (firstdice == 6 && seconddice == 6) {
			System.out.println("Great it is a Box car");
		}
		
	}

}
