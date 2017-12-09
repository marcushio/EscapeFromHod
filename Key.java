
/**
 * A key that opens the front door. 
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
     */
    public Key(String objectDescription, String interactDescription, String name){
        super(objectDescription, interactDescription, name); 
    }
    /**
     * When a person interacts with the key it goes into their inventory. 
     */
    public String interact(){
        return interactDescription; 
    }
}
