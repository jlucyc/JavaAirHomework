import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Plane plane;
    Pilot pilot;
    CabinCrew cabinCrew1;
    CabinCrew cabinCrew2;
    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void before(){
        flight = new Flight(pilot, cabinCrew1, passenger1, plane, "QUA100", "Perth", "BKK", "1230");
        plane = new Plane(PlaneType.BOEING747);
        pilot = new Pilot("Captain Cook", "Pilot", "CAP777");
        cabinCrew1 = new CabinCrew("Craig", "Grade One", "Prepare for take off");
        cabinCrew2 = new CabinCrew("Shirley","Grade Two", "Life jackets are under your seat");
        passenger1 = new Passenger("Brian", 2);
        passenger2 = new Passenger("Claire", 3);
        flightManager = new FlightManager();
    }



}
