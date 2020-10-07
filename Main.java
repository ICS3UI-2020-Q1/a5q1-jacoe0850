import java.util.Scanner;
/**
 * makes 1-12 multiplication table of integer
 * @jacoe0850 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create scanner for input
   Scanner input = new Scanner(System.in);
   // Ask for integer
   System.out.println("Please enter an integer to create a multiplication table for");
   // create variables
   int num = input.nextInt();
   int product;
   // for loop calculations
   for(int count = 1; count <= 12; count++){
   product = num*count;
   // all products
   System.out.println(count + " " + "x" + " " + num + " " + "=" + " " + product);
  }
  }
}
