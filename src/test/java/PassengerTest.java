import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Moira", 4);

    }

    @Test
    public void canGetPassengerName(){
        assertEquals("Moira", passenger.getName());
    }

    @Test
    public void canGetNumOfPassengerBags(){
        assertEquals(4, passenger.getNoOfBags());
    }

}
