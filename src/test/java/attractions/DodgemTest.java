package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor = new Visitor(19, 140, 40);
        visitor1 = new Visitor(10, 120, 40);
        visitor2 = new Visitor(1, 280, 10);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void payingNormalPrice(){
        assertEquals(35.5, dodgems.payingNormalPrice(visitor), 0);
    }

    @Test
    public void payingTallPrice(){
        assertEquals(7.75, dodgems.priceForTallPeople(visitor2), 0);
    }
}
