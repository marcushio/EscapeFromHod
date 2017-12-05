import java.util.Collection;
/**
 * Description of class GameModel here.
 *
 * @author Colton Trujillo
 * @version 12.4.17
 */
public class GameModel
{
    String message;
    Collection<Location> locations;
    Collection<Person> people;
    LocationFactory locationFactory;
    /**
     * Sets up initial conditions for the game. This includes creating all locations, putting objects in them, and giving them exits. It also includes creating people and giving
     * them initial locations. 
     */
    public void initialize(){
        
    }
    /**
     * Updates this GameModel's message. 
     */
    public void updateMessage(){
        
    }
    /**
     * Returns the current message of this GameModel.
     * 
     * @return String message to be displayed to the user reflecting the current state of the game.
     */
    public String getMessage(){
        return null;
    }
}
