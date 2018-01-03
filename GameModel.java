import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
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
            Exit exit = location.getExit(direction);
            if(exit == null) message = ""+Text.NO_EXIT;
            else{
            {
                Iterator it = player.getInventory().iterator();
                while(it.hasNext()){
                    exit.unlock((GameObject)it.next());
                }
               
                if(exit.isLocked()) message = ""+Text.LOCKED+"\n"+Text.SAME_LOCATION;
                else{
                player.setLocation(exit.getLocation());
                message = player.getLocation().getDescription();
        }
        
       
    }
    }
       
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
        return message+Text.NEW_LINE+Text.NEW_LINE+Text.NEW_LINE;
    }
    public void setBadInputMessage(){
        message = ""+Text.BAD_INPUT;
    }
    public GameObject getObject(String objectName){
        Location location = player.getLocation();
        return location.getObject(objectName);
       
    }
}
