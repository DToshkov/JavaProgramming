public class RoundingDemoRound()
  
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
    long roundedAnswer = Math.round(answer);
    answer = roundAnswer / 100.0;
    isEqual = answer == 0.20;
    System.out.println("After converssion");
    System.out.println("answer is " + answer);
    System.out.println("isEqual " + isEqual);
  }
}
