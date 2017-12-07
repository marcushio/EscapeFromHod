
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
       String[] tokens = input.split(" ");
       switch(tokens[0]){
           case "go": go(tokens[1]);
           case "use": use(tokens[1]);
           
        }
       
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
        model.changeCurrentLocation(direction);
        
    }
    private void use(String input){
        
    }
    
  
}
