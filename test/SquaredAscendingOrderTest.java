import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SquaredAscendingOrderTest {


    @Test

    public void testThatItReturnsAscendingNumbersThatAreSquared(){

        int [] array = {3,2,7,1,4};
        int [] expected= { 1,4,9,16,49};
        int [] actual= SquaredAscendingOrder.getSquaredOder(array);

        assertArrayEquals(actual,expected);


    }
}
