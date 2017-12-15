
/**
 * Enumeration class ObjectNames - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
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
