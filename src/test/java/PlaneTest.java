import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.AIRBUS380);
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.AIRBUS380, plane.getPlaneType());
    }

    @Test
    public void canSetPlaneType(){
        plane.setPlaneType(PlaneType.BOEING747);
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void canGetPlaneCapacity(){
        assertEquals(1000, plane.getPlaneCapacity());
    }

    @Test
    public void canGetPlaneWeightAllowance(){
        assertEquals(600, plane.getPlaneWeightAllowance(), 0.0);
    }



}
