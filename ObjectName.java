
/**
 * The enumeration of the object's names in the game. 
 *
 * @author Colton Trujillo
 * @version 12.15.17
 */
public enum ObjectName
{
    KEY("key");
    String name; 
    
    /**
     * Construct an objectName
     */
    ObjectName(String name){
        this.name = name; 
    }
    /**
     * @return The string manifestation of the objectName
     */
    public String toString(){
        return name; 
    }
}
