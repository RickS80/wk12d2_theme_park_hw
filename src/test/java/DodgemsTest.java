import Attractions.Dodgems;
import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;
    Visitor visitor;

    @Before
    public void before(){
        dodgems = new Dodgems("Karz");
        visitor = new Visitor(10,130,25);
    }

    @Test
    public void canGetName(){
        assertEquals("Karz", dodgems.getName());
    }

    @Test
    public void testDefaultPrice(){
        assertEquals(4.50, dodgems.defaultPrice(), 0.1);
    }

    @Test
    public void testHalfPrice(){
        assertEquals(2.25, dodgems.priceFor(visitor),0.1);
    }




}
