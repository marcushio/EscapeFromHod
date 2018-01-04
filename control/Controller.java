package control;
  import model.*;
  
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
    
    public Controller(){
       this.model = new GameModel();
    } 
    /**
     * Takes the input that has been processed and calls the appropriate action. 
     * @param command The command that has been formed based on the users input. 
     */
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
          case QUIT:
          System.exit(0);
          break;
          default:
          
        }
    }
    
    /**
     * Moves the players location. 
     * @param FullCommand the command that will be used to dictate how the controller will change the game. 
     */
    private void go(FullCommand command){
        model.changePlayerLocation(command.getDirection());
    }
    /**
     * For using an object in. 
     * @param String the input the user typed in for the corresponding GameObject. 
     */
    private void use(String input){
          GameObject object = model.getObject(input);
          model.useObject(object);
    }
    public GameModel getModel(){
        return model;
    }
    //private void help(){
        
    //}
}
