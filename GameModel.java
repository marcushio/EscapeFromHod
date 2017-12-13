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
    Boolean hasWinner = false;
    boolean inPlay = true;
    ArrayList<Location> locations = new ArrayList<Location>();
    Collection<Person> people;
    Person player;
    Location winningLocation;
    LocationFactory locationFactory = new LocationFactory();
    public GameModel(){
        initialize();
    }
    /**
     * Sets up initial conditions for the game. This includes creating all locations, putting objects in them, and giving them exits. The LocationFactory does most of the heavy lifting.
     * It also includes creating people and giving
     * them initial locations. 
     */
    public void initialize(){
        locations = locationFactory.getLocations();
        winningLocation = locationFactory.getWinningLocation();
         player = new Person(""+Text.PLAYER_DESCRIPTION);
        player.setLocation(locations.get(0));
        message = ""+Text.WELCOME+ " "+System.lineSeparator()+player.getLocation().getDescription();
       
       
    }
    /**
     * 
     */
    public boolean hasWinner(){
        return hasWinner;
        
    }
    public boolean isInPlay(){
        return inPlay;
    }
    /**
     * Sets the message to display instructions on how to play the game.
     */
    public void setMessageToHelp(){
        message = ""+Text.HELP;
    }
    public void useObject(GameObject object){
        Location location = player.getLocation();
        player.interact(object);
        message = object.getInteractDescription();
    }
    /**
     * Changes the location of the player if an exit for the given direction exists.
     * 
     * @param direction Direction the player presumably wants to go from the room they are currently in.
     * 
     */
    public void changePlayerLocation(Direction direction){
            Location location = player.getLocation();
            Location nextLocation = location.getExitLocation(direction);
            if(nextLocation != null) 
            {player.setLocation(nextLocation);
            message = player.getLocation().getDescription();
        }
        else message = ""+Text.NO_EXIT;
        if(player.getLocation() == winningLocation) {
            message = ""+Text.WIN_MESSAGE;
            inPlay = false;
        }
    }
    /**
     * Returns the current message of this GameModel.
     * 
     * @return String message to be displayed to the user reflecting the current state of the game.
     */
    public String getMessage(){
        return message;
    }
    public void setBadInputMessage(){
        message = ""+Text.BAD_INPUT;
    }
}
