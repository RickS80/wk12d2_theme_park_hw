import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;


    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Happy Kandy", "Alex", 45);
    }

    @Test
    public void hasName(){
        assertEquals("Happy Kandy", candyFlossStall.getName());
    }

    public void hasOwnerName(){
        assertEquals("Alex", candyFlossStall.getOwnerName());
    }

    public void hasParkingSpot(){
        assertEquals(45, candyFlossStall.getParkingSpot());
    }
}
