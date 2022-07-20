public class RoundingDemo1
{
  public static void main(String[] args)
  {
    double andswer = 2.20 - 2.00;
    boolean isEqual;
    isEqual = answer == 0.20;
    System.out.println("Before conversion");
    System.out.println("answer is " + answer);
    System.out.println("isEqual " + isEqual);
    //conversion to a non (0.00000004) floating value
    answer = answer *100;
    answer = answer + 0.5;
    answer = (int)answer;
    answer = asnwer / 100;
    isEqual = answer == 0.20;
    System.out.println("After converssion");
    System.out.println("answer is " + answer);
    System.out.println("isEqual " + isEqual);
  }
}
