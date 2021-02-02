package stalls;

public class CandyflossStall extends Stall {

    private int rating;

    public CandyflossStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot);
        this.rating = rating;
    }

    @Override
    public int getRating() {
        return rating;
    }
}
