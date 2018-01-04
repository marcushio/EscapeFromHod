package model;
import language.*;
/**
 * A key that opens a door. 
 *
 * @author Marcus Trujillo
 * @version 
 */
public class Key extends GameObject implements Holdable
{   
    String objectDescription; 
    String interactDescription; 
    String name; 
     
    /**
     * Use super's constructor
     * @param String objectDescription used as the description of the object
     * @param String interactDescrpition used to describe what happens when you interact with the key
     * @param String name the name of this key. 
     */
    public Key(Text objectDescription, Text interactDescription, Text name){
        super(objectDescription, interactDescription, name); 
    }
    /**
     * When a person interacts with the key it goes into their inventory. 
     * @return String interactDescription the description of what happens when you interact with the key. 
     */
    public String interact(){
        return interactDescription; 
    }
    
}
