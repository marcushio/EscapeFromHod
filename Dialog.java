
/**
 * Description of class Dialog here.
 *
 * @author Marcus Trujillo
 * @version 12.2.17 
 */
public enum Dialog
{
    WELCOME("Welcome"), 
    TEST("Test"),
    LIVING_ROOM_DESCRIPTION("You are in the living room."),
    DINING_ROOM_DESCRIPTION("You are in the dining room."),
    CLOSET_DESCRIPTION("You are in the closet."),
    KITCHEN_DESCRIPTION("You are in the kitchen."),
    LAUNDRYROOM_DESCRIPTION("You are in the laundry room."),
    GARAGE_DESCRIPTION("You are in the garage.");
    String text;
    Dialog(String text){
        this.text = text;
    }
    public String toString(){
        return text;
    }
}
