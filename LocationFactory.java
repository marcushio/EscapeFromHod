import java.util.ArrayList;
/**
 * Class to create Locations. 
 *
 * @author Colton Trujillo
 * @version 12/4/17
 */
public class LocationFactory
{
    
   public LocationFactory(){
       
    }
    /*
     * Returns an ArrayList with all of the game's Locations. 
     * 
     * @return ArrayList<Location> containing Location objects representing all the places a player can go in the game.
     */
   public ArrayList<Location> getLocations(){
       return makeLocations();
    }
    private ArrayList<Location> makeLocations(){
        ArrayList <Location> locations = new ArrayList<>();
        Location livingRoom = new Location(""+Dialog.LIVING_ROOM_DESCRIPTION);
        Location diningRoom = new Location(""+Dialog.DINING_ROOM_DESCRIPTION);
        Location closet = new Location (""+Dialog.CLOSET_DESCRIPTION);
        Location kitchen = new Location(""+Dialog.KITCHEN_DESCRIPTION);
        Location laundryRoom = new Location(""+Dialog.LAUNDRYROOM_DESCRIPTION);
        Location garage = new Location(""+Dialog.GARAGE_DESCRIPTION);
        //creating and adding exits
        Exit lrEast = new Exit(diningRoom, "A sinister archway into another room.");
        livingRoom.addExit(lrEast, Direction.EAST);
        Exit drSouth = new Exit(kitchen, "An open entrance to a spooky kitchen");
        kitchen.addExit(drSouth, Direction.SOUTH);
        Exit kSouth = new Exit(laundryRoom, "An unassuming door.");
        kitchen.addExit(kSouth, Direction.SOUTH);
        //adding exits
    
        return locations;
    }
}
