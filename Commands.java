import java.util.HashMap; 
import java.util.Scanner; 
//import java.io.*; 

/**
 * This class is an enum of all commands. Use it to recognize commands as they are typed 
 * in. 
 *
 * @author Marcus Trujillo
 * @version 
 */
public class Commands{
    private HashMap<String, Command> validCommands; 
    /**
     * Initialize the valid commands
     */
    public Commands(){
        validCommands = new HashMap<String, Command>(); 
        for(Command command : Command.values()){
            if(command != Command.UNKNOWN){
                validCommands.put(command.toString(), command); 
            }
        }
    }
    /**
     * Find the Command associated with a word. 
     * @param commandWord the word to look up
     * @return the Command that corresponds to commandWord, or UNKNOWN if it's not valid.
     * 
     */
    public Command getCommand(String commandWord){
        Command command = validCommands.get(commandWord); 
        return command;
    }
    /**
     * Check whether a String is a valid command word. 
     * @return true if valid, and false if not.
     */
    public boolean isCommand(String testString){
        return validCommands.containsKey(testString);
    }
    /**
     * @return the collection of all valid commands. 
     */
    public HashMap showAll(){
        return validCommands; 
    }
    /**
     * @return a FullCommand that has been created from user input. It's vetted and ready to go
     */
    public FullCommand getFullCommand(String userInput){
        String firstWord = null;
        String secondWord = null; 
        
        Scanner userInputProcessor = new Scanner(userInput); 
        if(userInputProcessor.hasNext()){
            firstWord = userInputProcessor.next(); 
            if(userInputProcessor.hasNext()){
                secondWord = userInputProcessor.next(); 
            }
        }
        
        return new FullCommand(getCommand(firstWord), secondWord); 
    }
}

