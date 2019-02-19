import Stalls.TobaccoStall;
import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        visitor1 = new Visitor(18,125,25);
        visitor2 = new Visitor(15,125,25);
        tobaccoStall = new TobaccoStall("Ted's tobacco", "Ted", 24);
    }

    @Test
    public void buyTobaccoPass(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitor1));
    }

    @Test
    public void buyTobaccoFail(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitor2));
    }

    @Test
    
}
