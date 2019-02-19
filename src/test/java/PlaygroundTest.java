import Attractions.Playground;
import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        playground = new Playground("Paul's playground");
        visitor1 = new Visitor(13,125,25);
        visitor2 = new Visitor(18,125,25);
    }

    @Test

    public void playgroundSecurityPass(){
        assertEquals(true, playground.isAllowedTo(visitor1));
    }

    @Test

    public void playgroundSecurityFail(){
        assertEquals(false, playground.isAllowedTo(visitor2));
    }
}
