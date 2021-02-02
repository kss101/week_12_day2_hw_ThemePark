package stalls;

public class IceCreamStall extends Stall {

    private int rating;
    public IceCreamStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot);
        this.rating = rating;
    }

    @Override
    public int getRating() {
        return rating;
    }
}
