
/**
 * The words used in the game to direct the character. 
 *
 * @author Marcus Trujillo
 * @version 12.2.17
 */
public enum Command
{
    USE("use"), GO("go"), HELP("help"), UNKNOWN("unknown") ; 
    
    private String commandString; 
    /**
     * Constructor of a command. Sets the corresponding string to the command. 
     * @param commandString the string form of the command. 
     */
    Command(String commandString){
        this.commandString = commandString; 
    }
    
    /**
     * @return the string form of the command. 
     */
    public String toString(){
        return commandString; 
    }
}
