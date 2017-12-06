
/**
 * The GameObject is an everyday object that exist in the world of the game. Ids are used to refer to 
 * unique individual GameObjects even if you have multiple objects with the same name. 
 * Players can use the "interact" command to interact and use the objects. 
 *
 * @author Marcus Trujillo
 * @version 12.2.17
 */
public abstract class GameObject
{   
    int id; 
    String name; 
    String objectDescription; 
    String interactDescription; 
    
    /**
     * The GameObject constructor that sets the id, name, and descriptions for both the object itself and
     * what happens when you interact with the game object. 
     */
    public GameObject(String objectDescription, String interactDescription, String name){
        this.objectDescription = objectDescription; 
        this.interactDescription = interactDescription; 
        this.name = name; 
    }
    /**
     * @return interactDescription 
     */
    public String getInteractDescription(){
        return interactDescription; 
    }
    /**
     * @return objectDescription a physical description of the object itself. 
     */
    public String getObjectDescription(){
        return objectDescription; 
    }
    /**
     *  This is the action when the player interacts with the GameObject. 
     */
    abstract public void interact();
    
    /**
     * Returns the id of the object
     */
    public int getId(){
        return id; 
    }        
}
