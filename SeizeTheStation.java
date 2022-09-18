import java.util.Random;
import java.util.Scanner;

public class SeizeTheStation 
{
  public static void main(String args[])
  {
    // declare a Scanner class object and Random class object 
    Scanner scan = new Scanner(System.in);
    Random randomGen = new Random();
    // variable to decrease distance to target 
    int randAddDist = 0;
    // variable to track remaining distance to target
    int randDistToMove = 0;
    // variable to use to supplement player / game interaction   
    int randInteract = 0;
    // variable to define player obstacle          
    char interact = '\0';
    // variable to allow player to proceed to target
    char again = '\0';
    // variable to set initial distance to goal
    int goal = 300; 
    // variable to set initial player health
    int health = 100;
    // count the number of loops
    int counter = 0;
    int healthcounter;
    int distancecounter = 0;
    // define a loop for at most twenty actions
    for (int count = 1; count <= 20; count++)
    {
      // signal the intention of the player
      System.out.println("\n-----------------------------------");
      System.out.println("\nAre you ready to proceed? ( Y or N )");
    again = scan.next().charAt(0); 
    if (again != 'Y') break;
    // define an obstacle
    interact = (char)(randomGen.nextInt(26) + 'a');
    if (interact >= 'a' && interact <= 'm')
    {
      // random number sets distance to move toward the objective
      randDistToMove = 1 + randomGen.nextInt(20);
      System.out.println("move forward " + randDistToMove + " ft");
      distancecounter =  randDistToMove +  randDistToMove; 
      
    }
     
    else if (count == 5) {
    	interact = (char)(randomGen.nextInt(26) + 'a');
        if (interact >= 'a' && interact <= 'm')
        System.out.println("Shrek has spawned");	
        }
    
    else
    {
      System.out.println("circumvent the next obstacle");
      health -= 10;
      
          }
    	
    counter++;
       
    }
    
    healthcounter = health;
    	if( healthcounter <= 0) {
		System.out.println("youre dead");
	}
    
    scan.close();
    int sumdistancecounter = goal - distancecounter;
    System.out.println("Number of attempts during this crusaide: " + counter);
    System.out.println("health " + healthcounter);
    System.out.println("distance to goal " + sumdistancecounter + "ft");
  }
}
