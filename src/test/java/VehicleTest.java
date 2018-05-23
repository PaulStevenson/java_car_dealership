import eNums.Make;
import eNums.Model;
import eNums.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class VehicleTest {

    Vehicle vehicle;




    @Before
    public void before(){
        vehicle = new Vehicle(Type.HATCHBACK, Make.FORD, Model.FIESTA, 9999.99, "red");
    }

    @Test
    public void hasType(){
        assertEquals(Type.HATCHBACK, vehicle.getType());
    }

    @Test
    public void hasMake(){
        assertEquals(Make.FORD, vehicle.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals(Model.FIESTA, vehicle.getModel());
    }

    @Test
    public void hasPrice(){
        assertEquals(9999.99, vehicle.getPrice(), 0.01);
    }

    @Test
    public void hasColour(){
        assertEquals("red", vehicle.getColour());
    }

}