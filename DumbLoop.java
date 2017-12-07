
/**
 * Write a description of class DumbLoop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DumbLoop
{
  public static void main(){
      InputParser parser = new InputParser();
      boolean running = true;
      GameModel model = new GameModel();
      Controller controller = new Controller(model);
      while(running){
          System.out.println(model.getMessage());
          controller.takeInput(parser.get());
        }
    }
    
}
