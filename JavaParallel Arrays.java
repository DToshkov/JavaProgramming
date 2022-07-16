import java.util.Scanner;
public class BasketballStats{
  private int[] jerseyNumber = {34,33,24,11,3,13,6,4,28,10,5};
  
  private String[] playerName = {"Jim","Joe", "Ken", "James", "John", "Bud", "Clark", "Berrry","Mike","JOse","Paul"};
  
  private int[] game1 = new int[11];
  private int[] game2 = new int[11];
  
  public void printPlayterNamesNumbers(){
    for(int i = 0; i <= 10; i++)
      System.out.printf("Number %d: %s \n", jerseyNumber[i], playerName[i]);
   // compiles each player ans their player numbers  

}

}
