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
    Location currentLocation;
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
        currentLocation = locations.get(0);
        message = ""+Dialog.WELCOME;
        player = new Person("Great Hero Kushi");
        player.setLocation(currentLocation);
        updateMessage();
    }
    /**
     * Updates this GameModel's message. 
     */
    public void updateMessage(){
        message = currentLocation.getDescription();
    }
    /**
     * 
     */
    public void changeCurrentLocation(Direction direction){
            Location location = player.getLocation();
            currentLocation = location.getExitLocation(direction);
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
