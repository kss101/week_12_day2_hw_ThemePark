import attractions.Dodgems;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    ThemePark themePark;
    IceCreamStall iceCreamStall;
    CandyflossStall candyflossStall;
    Dodgems dodgems;
    RollerCoaster rollerCoaster;

    @Before
    public void before() {
        themePark = new ThemePark("Funland");
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4, 4);
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1, 6);
        dodgems = new Dodgems("Bumper Cars", 5);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void canGetName(){
        assertEquals("Funland", this.themePark.getName());
    }

    @Test
    public void canAddStalls(){
        this.themePark.addStall(iceCreamStall);
        this.themePark.addStall(candyflossStall);
        assertEquals(2, this.themePark.getStalls().size());
        assertEquals("Dream Cones", this.themePark.getStalls().get(0).getName());
        assertEquals("Candy Land", this.themePark.getStalls().get(1).getName());
    }

    @Test
    public void canAddAttractions(){
        this.themePark.addAttraction(dodgems);
        this.themePark.addAttraction(rollerCoaster);
        assertEquals(2, this.themePark.getAttractions().size());
        assertEquals("Bumper Cars", this.themePark.getAttractions().get(0).getName());
        assertEquals("Blue Ridge", this.themePark.getAttractions().get(1).getName());
    }
}

