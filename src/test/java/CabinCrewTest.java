import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew cabinCrew;

    @Before
    public void before(){
        cabinCrew = new CabinCrew("Laura", "First Officer", "Cabin doors are secure");
    }

    @Test
    public void canGetCabinCrewName(){
        assertEquals("Laura", cabinCrew.getName());
    }

    @Test
    public void canSetCabinCrewName(){
        cabinCrew.setName("James");
        assertEquals("James", cabinCrew.getName());
    }

    @Test
    public void canGetCabinCrewRank(){
        assertEquals("First Officer", cabinCrew.getRank());
    }
    @Test
    public void canRelayMessagesToPassengers(){
        assertEquals("Cabin doors are secure", cabinCrew.getRelayMessage());

    }


}

