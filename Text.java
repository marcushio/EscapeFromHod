
/**
 * Description of class Text here.
 *
 * @author Marcus Trujillo and Colton Trujillo
 * @version 12.2.17 
 */
public enum Text
{
    WELCOME("Welcome"), 
    LINE_SEPARATOR("----------------------------------------"),
    EXITS("EXITS"),
    SAME_LOCATION("You are still in the same location."),
    LOCKED("This exit is locked."),
    FRONT_DOOR("A large, heavy door"),
    PLAYER_DESCRIPTION("Great Hero Kushi"),
    OUTSIDE_DESCRIPTION("You are outside! Free at last!"),
    LIVING_ROOM_DESCRIPTION("You are in the living room."),
    DINING_ROOM_DESCRIPTION("You are in the dining room."),
    CLOSET_DESCRIPTION("You are in the closet."),
    KITCHEN_DESCRIPTION("You are in the kitchen."),
    LAUNDRYROOM_DESCRIPTION("You are in the laundry room."),
    GARAGE_DESCRIPTION("You are in the garage."),
    NO_EXIT("No exit there. You are in the same room."),
    LIVING_ROOM_EAST("A sinister archway into another room."),
    DINING_ROOM_SOUTH("An open entrance to a spooky kitchen"),
    GO("go"),
    OPEN_ENTRANCE("Open entrance to a dining room."),
    INTERACT("interact"),
    KITCHEN_SOUTH("An unassuming door."),
    OBJECTS_SEEN("You see the following objects in the room: "),
    PICKED_UP("Added to inventory"),
    BAD_INPUT("Bad Input! Try again."),
    WIN_MESSAGE("YOu're free! You've won!"),
    HELP("Welcome to 508 Superstition: Escape From Hod.\nTo play, you may enter\none of the following commands followed by a second word that makes sense in the context.");
    String text;
    Text(String text){
        this.text = text;
    }
    public String toString(){
        return text;
    }
}
