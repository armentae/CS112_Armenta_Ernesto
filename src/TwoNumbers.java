//TwoNumbers.java
//Input-printing program.
import java.util.Scanner; //program uses class Scanner

public class TwoNumbers
{
   //main method begins execution of java application
   public static void main (  String[] args  )
   {
   // create Scanner to obtain input from the command window
   Scanner input = new Scanner(System.in);
   
   int number1; //first number to display
   int number2; //second number to display
   String word = "and";
   
   System.out.print("Enter one number: ");
   number1 = input.nextInt(); //first number entered

   System.out.print("Enter second number: ");
   number2 = input.nextInt(); //second number entered

   System.out.printf("Hello, you entered: %d %s %d", number1, word, number2);
   
   }//end method main
}//end class Input