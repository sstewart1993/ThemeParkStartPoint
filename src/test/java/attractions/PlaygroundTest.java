package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor;
    Visitor visitor1;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor = new Visitor(19, 120, 40);
        visitor1 = new Visitor(10, 120, 40);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void cantUsePark(){
        assertEquals(false, playground.isAllowedToPlay(visitor));
    }
    @Test
    public void canUsePark(){
        assertEquals(true, playground.isAllowedToPlay(visitor1));
    }
}
