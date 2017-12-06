import java.util.Scanner;
/**
 * Write a description of class DumbLoop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DumbLoop
{
  public static void main(){
      boolean running = true;
      Scanner scanner = new Scanner(System.in);
      GameModel model = new GameModel();
      Controller controller = new Controller(model);
      while(running){
          System.out.println(model.getMessage());
          controller.takeInput(scanner.next());
        }
    }
    
}
