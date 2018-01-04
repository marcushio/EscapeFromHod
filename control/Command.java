package control;
import language.Text;
/**
 * The words used in the game to direct the character. 
 *
 * @author Marcus Trujillo
 * @version 12.2.17
 */
public enum Command
{
    USE(Text.USE, Text.USE_DESCRIPTION), GO(Text.GO, Text.GO_DESCRIPTION),
    HELP(Text.HELP, Text.HELP_DESCRIPTION), 
    UNKNOWN(Text.UNKNOWN, Text.UNKNOWN_DESCRIPTION),
    QUIT(Text.QUIT, Text.QUIT_DESCRIPTION) ; 
    
    private String commandString; 
    private String description;
    /**
     * Constructor of a command. Sets the corresponding string to the command. 
     * @param commandString the string form of the command. 
     */
    Command(Text commandString, Text description){
        this.commandString = commandString.toString(); 
        this.description = description.toString();
    }
    
    /**
     * @return the string form of the command. 
     */
    public String toString(){
        return commandString; 
    }
    public String getDescription(){
        return description;
    }
}
