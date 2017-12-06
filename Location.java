
    
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * The Location class models a real world location. It has a description,
 * a Collection of Exit objects, and a Collection of GameObject objects.
 * 
 *
 * @author Colton Trujillo
 * @version 12/4/17
 */
public class Location
{
    HashMap<Direction, Exit> exits = new HashMap<Direction, Exit>();
    Collection<GameObject> objects;
    String description;
    /**
     * Creates a new location with the description given in the parameters.
     * 
     * @param description description of the location.
     * @return Location a new location object.
     */
    public Location(String description){
        this.description = description;
    }
    /**
     * Adds an exit to this Location's collection of exits.
     * 
     * @param exit Exit belonging to this Location.
     * @param direction Direction with the desired direction of the exit.
     */
    public  void addExit(Exit exit, Direction direction){
        exits.put(direction, exit);
    }
    /**
     * Adds a GameObject to this Location's collection of objects.
     * 
     * @param gameObject GameObject that is situated in this room.
     */
    public void addObject(GameObject gameObject){
        objects.add(gameObject);
    }
    /**
     * Returns a collection of Strings. Each entry corresponds to an exit in the location. Each entry 
     * should be obtained from one of the exit objects belonging to this location. Most likely, 
     * this collection should contain Strings representing a discription of the exit and
     * the direction of the exit. Example: {"West: Old wooden door", North: Creepy Staircase"}
     * 
     * @return Collection<String> Collection of Strings for which each entry has a description and direction
     * of a particular exit belonging to the Location.
     */
    Collection<String> listExits(){
        return null;
    }
    /**
     * Returns the location that corresponds to the direction given in the parameter. A HashMap is probably the best datastructure to contain this.
     */
    Location getExitLocation(Direction direction){
        Exit exit = exits.get(direction);
        if(exit == null) return this;
        return exit.getLocation();
    }
    /**
     * Returns a collection Strings. The collection of Strings should come from the objects that are in this room's Collection of GameObjects. Each entry should come from an
     * object's description. 
     * 
     * @return Collection<String> Collection containing a description for each GameObject in this Locatin's collection of GameObjects.
     */
    Collection<String> listObjects(){
        return null;}
        
    /**
     * Returns a description of this location.
     * 
     * @return String description of this location.
     */
    String getDescription(){
        return description;
    }
    /**
     * Returns a GameObject with the given ID, if it exits in this Location.
     * 
     * @param ID An integer with a unique identifier for an object that is assumed to exist somewhere in the GameModel.
     * @return GameObject the game object with the corresponding ID.
     */
    GameObject getObject(int ID){
        return null;
    }
 
}
