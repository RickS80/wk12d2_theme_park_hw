import Attractions.Dodgems;
import Attractions.Park;
import Attractions.Playground;
import Attractions.RollerCoaster;
import Stalls.CandyFlossStall;
import Stalls.IceCreamStall;
import Stalls.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    CandyFlossStall candyFlossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;



    @Before
    public void before() {
        themePark = new ThemePark();
    }

    @Test
    public void hasZeroAttractions(){
        assertEquals(0, themePark.getNumberOfAttractions());
    }

    @Test
    public void hasZeroStalls(){
        assertEquals(0, themePark.getNumbersOfStalls());
    }

    @Test
    public void canAddStalls(){
        themePark.addStall(candyFlossStall);
        themePark.addStall(iceCreamStall);
        themePark.addStall(tobaccoStall);
        assertEquals(3, themePark.getNumbersOfStalls());
    }

    @Test
    public void canAddAttractions(){
        themePark.addAttraction(dodgems);
        themePark.addAttraction(park);
        themePark.addAttraction(playground);
        themePark.addAttraction(rollerCoaster);
        assertEquals(4, themePark.getNumberOfAttractions());
    }
}
