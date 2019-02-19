import Attractions.RollerCoaster;
import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before

    public void before(){
        rollerCoaster = new RollerCoaster("Rick's rollercoaster");
        visitor1 = new Visitor(15, 150, 25);
        visitor2 = new Visitor(10,100,30);
    }

    @Test
    public void goOnRollerCoasterPass(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void goOnRollerCoasterFail(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }
}
