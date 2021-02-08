import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle(100);
    }



    @Test
    public void canDrink() {
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void canEmpty() {
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void canFill() {
        WaterBottle emptyBottle = new WaterBottle(0);
        assertEquals(100, emptyBottle.fill());
    }
}
