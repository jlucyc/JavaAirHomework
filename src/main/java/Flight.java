import java.util.ArrayList;

public class Flight {
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrew> crews;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilots, CabinCrew crews, Passenger passengers, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilots = new ArrayList<Pilot>();
        this.crews = new ArrayList<CabinCrew>();
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;


    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public void setPilots(ArrayList<Pilot> pilots) {
        this.pilots = pilots;
    }

    public ArrayList<CabinCrew> getCrews() {
        return crews;
    }

    public void setCrews(ArrayList<CabinCrew> crews) {
        this.crews = crews;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getPassengerList() {
        return passengers.size();
    }

    public int availableSeats() {
        return plane.getPlaneCapacity() - getPassengerList();
    }


    public void bookPassenger(Passenger passenger) {
        if (availableSeats() > 0) {
            passengers.add(passenger);
        }
    }

}


