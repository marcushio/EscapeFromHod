import java.util.ArrayList;
/**
 * Class to create Locations. 
 *
 * @author Colton Trujillo
 * @version 12/4/17
 */
public class LocationFactory
{
    Location winningLocation;
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
        Location outside = new Location(""+Text.OUTSIDE_DESCRIPTION);
        Location livingRoom = new Location(""+Text.LIVING_ROOM_DESCRIPTION);
        Location diningRoom = new Location(""+Text.DINING_ROOM_DESCRIPTION);
        Location closet = new Location (""+Text.CLOSET_DESCRIPTION);
        Location kitchen = new Location(""+Text.KITCHEN_DESCRIPTION);
        Location laundryRoom = new Location(""+Text.LAUNDRYROOM_DESCRIPTION);
        Location garage = new Location(""+Text.GARAGE_DESCRIPTION);
        //creating and adding exits
        Exit lrEast = new Exit(diningRoom, ""+Text.LIVING_ROOM_EAST);
        Exit lrSouth = new Exit(outside, ""+Text.FRONT_DOOR);
        lrSouth.lock(1);
        livingRoom.addExit(lrSouth, Direction.SOUTH);
        livingRoom.addExit(lrEast, Direction.EAST);
        Exit drSouth = new Exit(kitchen, ""+Text.DINING_ROOM_SOUTH );
        Exit kNorth = new Exit(diningRoom, ""+Text.OPEN_ENTRANCE);
        kitchen.addExit(kNorth, Direction.NORTH);
        Exit drWest = new Exit(livingRoom, ""+Text.LIVING_ROOM_EAST);
        diningRoom.addExit(drSouth, Direction.SOUTH);
        diningRoom.addExit(drWest, Direction.WEST);
        Exit kSouth = new Exit(laundryRoom, ""+Text.KITCHEN_SOUTH);
        Exit lNorth = new Exit(kitchen, ""+Text.KITCHEN_SOUTH);
        laundryRoom.addExit(lNorth, Direction.NORTH);
        kitchen.addExit(kSouth, Direction.SOUTH);
        //adding objects to rooms
      livingRoom.addObject(new Key("A key to the house", "You pick up the key", "key"));
        
        //adding Location objects to ArrayList
        locations.add(livingRoom);
        locations.add(diningRoom);
        locations.add(closet);
        locations.add(kitchen);
        locations.add(laundryRoom);
        locations.add(garage);
        winningLocation = outside;
        return locations;
    }
    public Location getWinningLocation(){
        return winningLocation;
    }
}
