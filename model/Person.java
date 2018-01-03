package model; 
import java.util.ArrayList; 

/**
 * A representation of the people in the game including the main player you control in the game. 
 *
 * @author Marcus Trujillo
 * @version 12.2.17
 */

public class Person
{   
    Location location; 
    ArrayList<GameObject> inventory; 
    String name; 
    
    /**
     * Constructor for person. Gives person a name. Client code is to use the setLocation in order to place person. 
     * @param A string for the name of the person being constructed. 
     */
    public Person(String name){
        this.name = name; 
        inventory = new ArrayList(); 
    }
   
    /**
     * Sets the location of the person object in the world. 
     * @param the location for the Person's location to be set to. 
     */
    void setLocation(Location location){
        this.location = location; 
    }
    
    /**
     * @return the location that the person has set.
     */
    Location getLocation(){
        return location; 
    }
    
    /**
     * The action for the person object to interact with a GameObject. The results will depend on the particular object the person interacts with 
     * @param the GameObject the player is going to interact with. 
     */
    public void interact(GameObject object){
        object.interact(); 
        if(object instanceof Holdable){
            inventory.add(object); 
        }
    }
    
    /**
     * @return the person's inventory
     */
    public ArrayList getInventory(){
        return inventory;
    }
    
}
