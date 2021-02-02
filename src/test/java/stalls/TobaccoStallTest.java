package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 7);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void checkVisitorIsOldEnough(){
        Visitor visitor = new Visitor(19, 1.74,17.50);
        assertEquals(true,  tobaccoStall.isAllowedTo(visitor));
    }
    @Test
    public void checkVisitorIsTooYoung(){
        Visitor visitor = new Visitor(9, 1.4,7.50);
        assertEquals(false,  tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void hasRating() {
        assertEquals(7, tobaccoStall.getRating());
    }
}
