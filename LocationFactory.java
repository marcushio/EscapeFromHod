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
        Location livingRoom = new Location("You are in the living room.");
        Location diningRoom = new Location("You are in the dining room.");
        Location closet = new Location ("You are in the closet.");
        Location kitchen = new Location("You are in the kitchen.");
        Location laundryRoom = new Location("You are in the laundry room.");
        Location garage = new Location("You are in the garage.");
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
