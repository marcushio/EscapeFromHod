
/**
 * Description of class Key here.
 *
 * @author Marcus Trujillo
 * @version 
 */
public class Key extends GameObject implements Holdable
{   
    String objectDescription; 
    String interactDescription; 
    String name; 
    int id; 
    
    /**
     * Use super's constructor
     */
    public Key(String objectDescription, String interactDescription, String name, int id){
        super(objectDescription, interactDescription, name, id); 
    }
    /**
     * When a person interacts with the key it goes into their inventory. 
     */
    public String interact(){
        return interactDescription; 
    }
}
