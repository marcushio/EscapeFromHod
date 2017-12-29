
/**
 * The loop used for gameplay. It repeats the cycle of getting input, adjusting the game accordingly then repeating the process until a win is achieved. 
 *
 * @author Colton Trujillo
 * @version 12.17.17
 */
public class DumbLoop
{
  public static void main(){
      InputParser parser = new InputParser();
      boolean running = true;
      GameModel model = new GameModel();
      Commands commands = new Commands();
      Controller controller = new Controller(model);
      
      while(running){
          System.out.println(model.getMessage());
          if(model.isInPlay()){
              controller.takeInput(commands.getFullCommand(parser.get()));
          }
          else running = model.isInPlay();  
      }  
    }
}
