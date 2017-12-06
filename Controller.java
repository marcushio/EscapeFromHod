
/**
 * Write a description of class Controller here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Controller
{
    GameModel model;
   public Controller(GameModel model){
       this.model = model;
    }
   public void takeInput(String input){
       model.updateMessage();
       model.changeCurrentLocation(Direction.EAST);
    }
}
