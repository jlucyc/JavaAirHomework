import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    CabinCrew cabinCrew1;
    CabinCrew cabinCrew2;
    Pilot pilot;
    Plane plane;


    @Before
    public void before(){
        passenger1 = new Passenger("Jessica Jones", 2);
        passenger2 = new Passenger("Iron man", 1);
        cabinCrew1 = new CabinCrew("Maggie Rogers", "Grade One", "");
        cabinCrew2 = new CabinCrew("Thomas Turner", "Grade Two", "");
        pilot = new Pilot("Amelia Earhart", "Captain", "CAP123");
        plane = new Plane(PlaneType.AIRBUS380);
        flight = new Flight(pilot, cabinCrew2, passenger1, plane,  "AF374", "Paris", "Glasgow", "1750");
    }

    @Test
    public void canGetPassenger1Name(){
        assertEquals("Jessica Jones", passenger1.getName());
    }

    @Test
    public void canGetPassenger1NoOfBags(){
        assertEquals(2, passenger1.getNoOfBags());
    }

    @Test
    public void canGetCabinCrew2Rank(){
        assertEquals("Grade Two", cabinCrew2.getRank());
    }

    @Test
    public void canGetPilotName(){
        assertEquals("Amelia Earhart", pilot.getName());
    }

    @Test
    public void canGetDepartsFrom(){
        assertEquals("Glasgow", flight.getDepartureAirport());
    }

    @Test

    public void canGetPassengerList(){
        assertEquals(0, flight.getPassengerList());
    }

    @Test
    public void canReturnAvailableSeats(){
        assertEquals(1000, flight.availableSeats());
    }

    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger2);
        assertEquals(999, flight.availableSeats());
        assertEquals(1, flight.getPassengerList());
    }


}
