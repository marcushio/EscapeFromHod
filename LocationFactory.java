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
   public ArrayList<Location> getLocations(){
       return null;
    }
    private ArrayList<Location> makeLocations(){
        ArrayList <Location> locations = new ArrayList<>();
        
        Location livingRoom = new Location("You are in the living room.");
        
        Location diningRoom = new Location("You are in the dining room.");
        Location closet = new Location ("You are in the closet.");
        Location kitchen = new Location("You are in the kitchen.");
        Location laundryRoom = new Location("You are in the laundry room.");
        Location garage = new Location("You are in the garage.");
        
        //adding exits
        //livingRoom.addExit(diningRoom, Direction.)
        return locations;
    }
}
