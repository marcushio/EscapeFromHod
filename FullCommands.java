
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
     * create a full command. Give a first (Command) word and a second. 
     * @param command. If it's not recognized it'll be the UNKNOWN Command.
     */
    public FullCommands(Command command, String secondWord){
        this.command = command; 
        this.secondWord = secondWord; 
    }
    /**
     * return the Command part of the FullCommand. 
     * @return command
     */
    public Command getCommand(){
        return command; 
    }
    
    /**
     *
     * @return the second word. It returns null if there wasn't a second. 
     */
    public String getSecondWord(){
        return secondWord; 
    }
    /**
     * @return true if this command wasn't understood. 
     */
    public boolean isUnknown(){
        return (command == Command.UNKNOWN); 
    }
    /**
     * @return true if the command has a second word. 
     */
    public boolean hasSecondWord(){
        return (secondWord != null); 
    }
}
