package model;
import language.*;
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
    static int count; 
    String name; 
    String objectDescription; 
    String interactDescription; 
    int id; 
    
    /**
     * The GameObject constructor that sets the id, name, and descriptions for both the object itself and
     * what happens when you interact with the game object. 
     * @param String objectDescription the description of the object
     * @param String interactDescription used to describe what happens when the object is interacted with. 
     * @param String name the name of the GameObject. 
     */
    public GameObject(Text objectDescription, Text interactDescription, Text name){
        this.objectDescription = objectDescription.toString(); 
        this.interactDescription = interactDescription.toString(); 
        this.name = name.toString(); 
        count += 1; 
        id = count; 
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
    abstract public String interact();
    /**
     * @return the id of the object
     */
    public int getId(){
        return id; 
    }    
    /**
     * @return String name - Put the object into it's string essence. 
     */
    public String toString(){
        return name; 
    }
}
