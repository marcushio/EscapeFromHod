
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
          use(command.getSecondWord());
          break;
          case GO: 
          go(command);
          break;
          case HELP:
          model.setMessageToHelp();
          break;
          default:
          
        }
    }
    
    private void go(FullCommand command){
        model.changePlayerLocation(command.getDirection(command.getSecondWord()));
    }
    private void use(String input){
          GameObject object = model.getObject(input);
          model.useObject(object);
    }
    private void help(){
        
    }
    
    
  
}
