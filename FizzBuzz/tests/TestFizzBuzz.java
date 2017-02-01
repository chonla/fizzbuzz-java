import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chonla on 2/1/2017 AD.
 */
public class TestFizzBuzz {

    private FizzBuzz fizzbuzz;

    @Before
    public void setUp() {
        fizzbuzz = new FizzBuzz();
    }

    @Test
    public void testGiven1ShouldReturn1() {
        String result = fizzbuzz.get(1);
        assertEquals("1", result);
    }

    @Test
    public void testGiven2ShouldReturn2() {
        String result = fizzbuzz.get(2);
        assertEquals("2", result);
    }
}
