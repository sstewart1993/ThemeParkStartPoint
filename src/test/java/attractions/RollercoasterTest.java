package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor1;
    Visitor visitor2;



    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(19, 140, 40);
        visitor1 = new Visitor(10, 120, 40);
        visitor2 = new Visitor(15, 280, 16.8);
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
    public void tooSmallToRide(){
        assertEquals(false, rollerCoaster.isAllowedToRide(visitor));
    }
    @Test
    public void tooYoungToRide(){
        assertEquals(false, rollerCoaster.isAllowedToRide(visitor1));
    }
    @Test
    public void canRide(){
        assertEquals(true, rollerCoaster.isAllowedToRide(visitor2));
    }

    @Test
    public void payingNormalPrice(){
        assertEquals(31.6, rollerCoaster.payingNormalPrice(visitor), 0);
    }

    @Test
    public void payingTallPrice(){
        assertEquals(0, rollerCoaster.priceForTallPeople(visitor2), 0);
    }


}
