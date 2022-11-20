import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Andrea", "Pilot", "CAPNO1");
    }

    @Test
    public void canGetPilotsName(){
        assertEquals("Andrea", pilot.getName());
    }

    @Test
    public void canSetPilotsName(){
        pilot.setName("Lucy");
        assertEquals("Lucy", pilot.getName());
    }

    @Test
    public void canGetPilotsRank(){
        assertEquals("Pilot", pilot.getRank());
    }

    @Test
    public void canSetPilotsRank(){
        pilot.setRank("Top Pilot");
        assertEquals("Top Pilot", pilot.getRank());
    }

    @Test
    public void canGetPilotsLicenceNum(){
        assertEquals("CAPNO1", pilot.getLicence());
    }

    @Test
    public void canSetPilotsLicenceNum(){
        pilot.setLicence("CAP321");
        assertEquals("CAP321", pilot.getLicence());
    }


}
