import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
// Dimitar Toshkov 
// Laboratory 2 
// Oakton Community College CSC 241 
// Date 9/10/2022 12:14PM
public class GrossPay {
	public static void main(String[] args) 
	  {
	   // declare an object that will display two decimal digits
	   NumberFormat nf = NumberFormat.getCurrencyInstance();
	   Scanner sc = new Scanner(System.in);
	   // declare an object that will display the current date 
	   Date myDate = new Date();
	   String myDateFormat = "MM/dd/yyyy";
	   SimpleDateFormat dtToday = new SimpleDateFormat(myDateFormat);
	   System.out.println("Today's Date is: " + dtToday.format(myDate));
	   
	   // display the name of the programmer
	   System.out.println(" Programmer: " + " Dimitar Toshkov ");
	// Declare all variables for gross pay calculations 
	   String empName = "";
	   Double grosspay = 0.0;
	   int numItems;
	   final double choiceTwo = 7.5; 
	   // prompt for employee name 
	   System.out.println(" Enter Employee Name: " );
	   empName = sc.nextLine();
	   
	   // prompt for number of items produced 
	   System.out.println(" Enter number of items produced: " );
	   numItems = sc.nextInt();
	   
	   // prompt for pay rate choice 
	   System.out.println(" Choose 1 for flat rate or 2 if differential rate: " );
	   int choice = sc.nextInt();
	   
	   // input
	   double tier1, tier2, tier3, tier4;
	   double nettierone, nettiertwo, nettierthree;
	   final double  nettierfour = 217.0;
	   final double taxRate = 0.3265;
	   
	   
	   
	   tier1 = 112 * 7.15;
	   tier2 = 38 * 7.45;
	   tier3 = 67 * 7.95;
	   tier4 = (numItems - nettierfour) * 8.4;
	   
	   double programOne, netprogramOne;
	   programOne = tier1 + tier2 + tier3 + tier4;
	   netprogramOne = programOne - (programOne * taxRate);
	   
	   
	   
	   
	   tier1 =  (numItems - 112);
	   tier2 = (tier1 );
	   
	   
	   // processing
	   if (choice == 1) {
		   System.out.println("Employee name " + empName );
		   System.out.println("Employee Earnings after taxes per " + numItems + " is "+ nf.format(netprogramOne ) );
		   System.out.println("Employee Net Earnings pre taxes per " + numItems + " is "+ nf.format(programOne ));
		   double fica1, medi1, Fit1; 
			 fica1 = (programOne * 0.0620);
			 medi1 =  (programOne * 0.01450);
			 Fit1 =  (programOne * 0.25);
			 System.out.println("medicare tax " +  " is "+ nf.format(medi1 ));
			 System.out.println("FICA tax " +  " is "+ nf.format(fica1 ));
			 System.out.println("Federal tax " +  " is "+ nf.format(Fit1 ));
			 System.out.println("Employee Net Earnings pre taxes per " + numItems + " is "+ nf.format(programOne ));
			 
			 
	   }
	   else {
		 double programTwo  = numItems * choiceTwo;
		 double netprogramTwo = programTwo - (programTwo * taxRate);
		 
		 double fica, medi, Fit; 
		 fica = (programTwo * 0.0620);
		 medi =  (programTwo * 0.01450);
		 Fit =  (programTwo * 0.25);
		 System.out.println("Employee name " + empName );
		 System.out.print("Employee Earnings after taxes per " + numItems + " is "+ nf.format(netprogramTwo ));
		 System.out.println("Employee Net Earnings pre taxes per " + numItems + " is "+ nf.format(programTwo ));
		 System.out.println("medicare tax " +  " is "+ nf.format(medi ));
		 System.out.println("FICA tax " +  " is "+ nf.format(fica ));
		 System.out.println("Federal tax " +  " is "+ nf.format(Fit ));
		 
		
	        	        
	                
	        System.out.println("Programmer: Dimitar" );
	        
}
	   }
	  }


