
/**
 * Enum for directions the player can move. Trying to keep it standard. 
 *
 * @author Marcus Trujillo
 * @version 12.2.17
 */
public enum Direction
{
    NORTH("north"), SOUTH("south"), EAST("east"), WEST("west"); 
    
    String direction; 
    /**
     * Direction constructor sets the corresponding string direction to the direction. 
     */
    Direction(String direction){
        this.direction = direction; 
    }
    
    /**
     * @return direction the string form of the direction
     */
    public String toString(){
        return direction; 
    }
}
