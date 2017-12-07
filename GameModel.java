import java.util.Collection;
import java.util.ArrayList;
/**
 * Description of class GameModel here.
 *
 * @author Colton Trujillo
 * @version 12.4.17
 */
public class GameModel
{
    String message;
    ArrayList<Location> locations = new ArrayList<Location>();
    Collection<Person> people;
    Person player;
    LocationFactory locationFactory = new LocationFactory();
    public GameModel(){
        initialize();
    }
    /**
     * Sets up initial conditions for the game. This includes creating all locations, putting objects in them, and giving them exits. It also includes creating people and giving
     * them initial locations. 
     */
    public void initialize(){
        locations = locationFactory.getLocations();
       
        message = ""+Text.WELCOME;
        player = new Person("Great Hero Kushi");
        player.setLocation(locations.get(0));
        updateMessage();
    }
    /**
     * Updates this GameModel's message. 
     */
    public void updateMessage(){
        message = player.getLocation().getDescription();
    }
    /**
     * 
     */
    public void changeCurrentLocation(Direction direction){
            Location location = player.getLocation();
            player.setLocation( location.getExitLocation(direction));
         
            updateMessage();
    }
    /**
     * Returns the current message of this GameModel.
     * 
     * @return String message to be displayed to the user reflecting the current state of the game.
     */
    public String getMessage(){
        return message;
    }
}
