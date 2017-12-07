
/**
 * Description of class Text here.
 *
 * @author Marcus Trujillo and Colton Trujillo
 * @version 12.2.17 
 */
public enum Text
{
    WELCOME("Welcome"), 
    TEST("Test"),
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
    INTERACT("interact"),
    KITCHEN_SOUTH("An unassuming door."),
    OBJECTS_SEEN("You see the following objects in the room: "),
    PICKED_UP("Added to inventory"); 

    String text;
    Text(String text){
        this.text = text;
    }
    public String toString(){
        return text;
    }
}
