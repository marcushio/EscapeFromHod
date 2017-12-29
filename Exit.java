
/**
 * Model of an Exit to a location. It should have a description and a Location that it leads to. 
 *
 * @author Colton Trujillo
 * @version 12/4/17
 */
public class Exit
{
    Location location;
    String description;
    Boolean locked = false;
    int keyCode = 0;
    
    /**
     * Creates a new Exit with the given location and description.
     * 
     * @param location Location object that this exit leads to.
     * @param description Description of this exit. In example: "Rusty metal door."
     */
    public Exit(Location location, String description){
        this.location = location;
        this.description = description;
    }
    /**
     * Returns the location that this Exit leads to.
     * 
     * @return Location the location that this Exit leads to.
     */
    Location getLocation(){
        if (!locked)return location;
        else return null;
    }
    /**
     * Returns a description of this Exit.
     * 
     * @return String description of this exit.
     */
    public String toString(){
        return description;
    }
    /**
     * @param the keyCode used for this particular key. Every key has a unique code so that a lock isn't unlocked by any old key, but only one with a matching code. 
     */
    public void lock(int keyCode){
        locked = true;
        this.keyCode = keyCode;
    }
    /**
     * Sets the locked boolean to false if the keycode matches the door. 
     */
    public void unlock(GameObject key){
        if (key.getId() == keyCode) locked = false;
    }
    /**
     * @return The boolean "locked" , the variable dictating whether a door is locked or not. 
     */
    public boolean isLocked(){
        return locked; 
    }
}
