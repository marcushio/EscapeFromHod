import java.util.Scanner;
/**
 * The loop used for gameplay. It repeats the cycle of getting input, adjusting the game accordingly then repeating the process until a win is achieved. 
 *
 * @author Colton Trujillo
 * @version 12.17.17
 */
public class DumbLoop
{
  public static void main(){
      boolean running = true;
      GameModel model = new GameModel();
      Commands commands = new Commands();
      Controller controller = new Controller(model);
      
      while(running){
          System.out.println(model.getMessage());
          if(model.isInPlay()){
              try
              (Scanner scanner = new Scanner(System.in)){
              String input = scanner.nextLine();
              input = input.toLowerCase();
              controller.takeInput(commands.getFullCommand(input));
          }
          catch(Exception ex){
              System.out.println("IO error");
            }
        }
          else running = model.isInPlay();  
      }  
    }
}
