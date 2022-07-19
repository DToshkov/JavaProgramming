import java.util.Scanner;
// use this program to calulate days and minutes 
public class MinutesConversion {
    public static void main(String[] args) {
        // Write your code here
   Scanner input = new Scanner(System.in);
    double days;
    double hours;
    int minutes;
    double MINUTES_IN_HOUR = 60;
    double HOURS_IN_DAYS = 24;

  

    System.out.println("Enter Minutes >> ");
    minutes = input.nextInt();
    hours = (minutes/MINUTES_IN_HOUR);
   
    days = ((minutes / MINUTES_IN_HOUR) / HOURS_IN_DAYS);

System.out.println(minutes + " minutes is " + hours + " hours " + "or " + days +  " days." );
    }
}
