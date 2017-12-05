
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
    /**
     * Creates a new Exit with the given location and description.
     * 
     * @param location Location object that this exit leads to.
     * @param description Description of this exit. In example: "Rusty metal door."
     * @return Exit new exit.
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
        return location;
    }
    /**
     * Returns a description of this Exit.
     * 
     * @return String description of this exit.
     */
    String getDescription(){
        return description;
    }
}
