package language;

/**
 * Standardized enums of text used in the game. Listed in Alphabetical order.
 *
 * @author Marcus Trujillo and Colton Trujillo
 * @version 12.2.17 
 */
public enum Text
{
  
    BAD_INPUT("Bad Input! Try again."),
    CLOSET_DESCRIPTION("You are in the closet."),
    DINING_ROOM_SOUTH("An open entrance to a spooky kitchen"),
    DINING_ROOM_DESCRIPTION("You are in the dining room."),
    EXITS("EXITS"),
    SAME_LOCATION("You are still in the same location."),
    LOCKED("This exit is locked."),
    FRONT_DOOR("A large, heavy door"),
    GARAGE_DESCRIPTION("You are in the garage."),
    GO("go"),
    HELP("Welcome to 508 Superstition: Escape From Hod.\nTo play, you may enter\none of the following commands followed by a second word that makes sense in the context. Kgo <direction> : Player goes to the exit in the direction you type.\n use <object> use the object you type in\n help : lists the commands you can use."),
    INTERACT("interact"),
    KITCHEN_DESCRIPTION("You are in the kitchen."),
    KITCHEN_SOUTH("An unassuming door."),
    LIVING_ROOM_DESCRIPTION("You are in the living room."),
    LAUNDRYROOM_DESCRIPTION("You are in the laundry room."),
    LINE_SEPARATOR("----------------------------------------"),
    LIVING_ROOM_EAST("A sinister archway into another room."),
    NO_EXIT("No exit there. You are in the same room."),
    OBJECTS_SEEN("You see the following objects in the room: "),
    OPEN_ENTRANCE("Open entrance to a dining room."),
    OUTSIDE_DESCRIPTION("You are outside! Free at last!"),
    PICKED_UP("Added to inventory"),
    PLAYER_DESCRIPTION("Great Hero Kushi"),
    WELCOME("Welcome"),
    KEY_DESCRIPTION("A key to the house"),
    KEY_INTERACT("You pick up the key"),
    KEY("key"),
    WIN_MESSAGE("You're free! You've won!"),
    NEW_LINE(System.getProperty("line.separator"))
    ;
    
    String text;
    
    /**
     * Construct the text. 
     * @param String text the string that is used for the toString method. 
     */
    Text(String text){
        this.text = text;
    }
    /**
     * The string used to represent the text. 
     */
    public String toString(){
        return text;
    }
}
