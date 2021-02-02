package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void checkVisitorEligibleToRide(){
        Visitor visitor = new Visitor(13, 1.74,17.50);

        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }
    @Test
    public void checkVisitorIneligibleToRide(){
        Visitor visitor = new Visitor(12, 1.5,7.50);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void checkPriceForRegularVisitor(){
        Visitor visitor = new Visitor(13, 1.74,17.50);
        assertEquals(8.40, rollerCoaster.priceFor(visitor), 0.0);
    }

    @Test
    public void checkPriceForTallVisitor(){
        Visitor visitor = new Visitor(19, 2.04,17.50);
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.0);
    }

}
