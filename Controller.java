
/**
 * Write a description of class Controller here.
 *
 * @author Colton Trujillo
 * @version 12/7/17
 */
public class Controller
{
    GameModel model;
    Commands commands = new Commands();
   public Controller(GameModel model){
       this.model = model;
    }
   public void takeInput(String input){
      
    }
    
    private void go(String input){
        Direction direction = null;
        switch(input){
            case "north": direction = Direction.NORTH;
            break;
            case "south": direction = Direction.SOUTH;
            break;
            case "east": direction = Direction.EAST;
            break;
            case "west": direction = Direction.WEST;
            break;
        }
        model.changePlayerLocation(direction);
        
    }
    private void use(String input){
        
    }
    
  
}
