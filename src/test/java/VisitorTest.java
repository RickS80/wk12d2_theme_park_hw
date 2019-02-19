import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(15,130,25);
    }

    @Test
    public void visitorHasAge(){
        assertEquals(15, visitor.getAge());
    }

    @Test
    public void visitorHasHeight(){
        assertEquals(130, visitor.getHeight());
    }

    @Test
    public void visitorHasMoney(){
        assertEquals(25, visitor.getMoney(), 0.01);
    }

}
