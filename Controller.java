
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
          go(command.getSecondWord());
          break;
          case HELP:
          model.setMessageToHelp();
          break;
          default:
          
        }
    }
    
    private void go(String direction){
        //Direction direction = 
        //model.changePlayerLocation(direction);
    }
    private void use(String input){
          //GameObject object = model.
          //model.useObject(object);
    }
    private void help(){
        
    }
    
    
  
}
