
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
       model.updateMessage();
    }
    
    private void go(String input){
       
        switch(input){
            case "north": model.changeCurrentLocation(Direction.NORTH);
            break;
            case "south": model.changeCurrentLocation(Direction.SOUTH);
            break;
            case "east": model.changeCurrentLocation(Direction.EAST);
            break;
            case "west": model.changeCurrentLocation(Direction.WEST);
            default:
        }
        
    }
    private void use(String input){
        
    }
    
  
}
