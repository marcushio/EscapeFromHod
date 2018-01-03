package control;
import language.*;
/**
 * A combination of words that are used to direct gameplay in the game. A FullCommand is composed of a command as the first word and either a direction or an object 
 * for the second word. The game can use it to make a useful way of dictating gameplay rather than just raw userinput strings. 
 *
 * @author Marcus Trujillo
 * @version 12.8.17 
 */
public class FullCommand
{
    public Command command; 
    public String secondWord; 
    
    /**
     * create a full command. Give a first (Command) word and a second. 
     * @param command. If it's not recognized it'll be the UNKNOWN Command.
     */
    public FullCommand(Command command, String secondWord){
        this.command = command; 
        this.secondWord = secondWord; 
    }
    public Direction getDirection(){
        switch(secondWord)
        {
            case "north": return Direction.NORTH;
            case "south": return Direction.SOUTH;
            case "east": return Direction.EAST;
            case "west": return Direction.WEST;
            default: return Direction.UNKNOWN;
            
        }
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
