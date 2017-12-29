import java.util.Scanner;

/**
 * Takes raw String input and turns it into something that is relevant to the game.
 *
 * @author Colton Trujillo
 * @version 12/5/2017
 */
public class InputParser
{
   Scanner scanner = new Scanner(System.in);
   
   /**
    * Gets the input from the user and set's all characters to lowercase. 
    * @return String input - what the user typed, but set in all lower. 
    */
   public String get(){  
        String input = scanner.nextLine();
        input = input.toLowerCase();
        return input;
   }
}
