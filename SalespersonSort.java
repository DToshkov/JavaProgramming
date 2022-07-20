import java.util.*;
public class SalespersonSort
{
   public static void main(String[] args)
   {
   Salesperson[] salesID = new Salesperson[7];
     Scanner in = new Scanner(System.in);
     String message= "";
     for( int i = 0; i< salesID.length; i++)
      {
          System.out.println("Enter an ID number");
          int id = in.nextInt();
          System.out.println("Enter sales value");
          Double sales = in.nextDouble();
          salesID[i] = new Salesperson(id, sales);
      }        
    System.out.println("By which field do you want to sort? \n(I)d number or (S)ales");
    String entry;
    entry = in.next();
    if(entry.charAt(0) == 'I')
        {
            sortByID(salesID);
            message = "Sort by ID number\n";

        }
     if(entry.charAt(0) == 'S')
        {
            sortBySales(salesID);
            message = "Sort by Sales\n";
        }
        display(salesID, message);
}  
   
   
    public static void sortByID(Salesperson[] salesID){
        int a,b;
        Salesperson temp;
        int highSub = salesID.length - 1;
        for (a =0; a <highSub; a++)
        {
            for (b=0; b<highSub; b++)
            if(salesID[b].getId()>salesID[b +1].getId())
            {
                temp = salesID[b];
                salesID[b]=salesID[b+1];
                salesID[b+1] = temp;

            }
        }
    }

     public static void sortBySales(Salesperson[] salesID){
        int a,b;
        Salesperson temp;
        int highSub = salesID.length - 1;
        for (a =0; a <highSub; a++)
        {
            for (b=0; b<highSub; b++)
            if(salesID[b].getSales()>salesID[b +1].getSales())
            {
                temp = salesID[b];
                salesID[b]=salesID[b+1];
                salesID[b+1] = temp;
            }
            }
            }
    public static void display(Salesperson[] s , String message)
    
		    {
		        int len= s.length;
                for(int i = 0; i <len; i++)
                {
                    message = message + s[i].getId() + ", " + s[i].getSales() + "\n";
        System.out.println(message);

                }
                
}
}    

