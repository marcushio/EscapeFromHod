
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
    
    private void go(Direction direction){
        model.changePlayerLocation(direction);
    }
    private void use(String input){
        
    }
    private void help(){
        
    }
    
    
  
}
