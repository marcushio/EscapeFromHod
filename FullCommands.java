
/**
 * Description of class FullCommands here.
 *
 * @author Marcus Trujillo
 * @version 12.8.17 
 */
public class FullCommands
{
    public Command command; 
    public String secondWord; 
    
    /**
     * 
     */
    public FullCommands(Command command, String secondWord){
        this.command = command; 
        this.secondWord = secondWord; 
    }
    /**
     * 
     */
    public Command getCommand(){
        return command; 
    }
    
    /**
     * 
     */
    public String getSecondWord(){
        return secondWord; 
    }
    /**
     * 
     */
    public boolean isUnknown(){
        return (command == Command.UNKNOWN); 
    }
    /**
     * 
     */
    public boolean hasSecondWord(){
        return (secondWord != null); 
    }
}
