import java.util.Scanner;

public class FizzBuzz
{
   
    
   public static void main(String [] args)
   {
   
   
   for(int n=1; n<=100; n++)
   {
      String number = "";    
	   if(n%3 == 0)
      {
         number += ("Fizz");
         
		}
      else if(n%5 == 0)
      {
			number += ("Buzz");
      }
         
       else if (n%5 == 0 && n%3 == 0)
       {
			number += ("FizzBuzz");
      
			//number(n);
		}
      
      number = Integer.toString(n);
     System.out.println(number);
   
   // Close files and exit                   				 
		//System.exit(0);	
	} // End main
   
   }
   
} // End class
   