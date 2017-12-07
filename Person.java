import java.util.ArrayList; 

/**
 * Description of class Person here.
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
     */
    public Person(String name){
        this.name = name; 
        inventory = new ArrayList(); 
    }
   
    /**
     * Sets the location of the person object in the world. 
     */
    void setLocation(Location location){
        this.location = location; 
    }
    
    /**
     * Gets the location that the person has set.
     */
    Location getLocation(){
        return location; 
    }
    
    /**
     * The action for the person object to interact with a GameObject. The results will depend on the particular object the person interacts with 
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
    public ArrayList getInventoy(){
        return inventory;
    }
    
}
