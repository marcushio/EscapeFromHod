
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
   public void takeInput(FullCommand command){
      switch(command.getCommand()){
          case USE:
          GameObject object = (GameObject) command.getSecondWord();
          model.useObject(object);
          break;
          case GO: 
          Direction direction = (Direction) command.getSecondWord();
          model.changePlayerLocation(direction);
          break;
          case HELP:
          model.setMessageToHelp();
          break;
          default:
          
        }
    }
    
    private void go(Direction direction){
        model.changePlayerLocation(direction);
    }
    private void use(String input){
        
    }
    private void help(){
        
    }
    
    
  
}
