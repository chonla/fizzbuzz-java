import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chonla on 2/1/2017 AD.
 */
public class TestFizzBuzz {

    @Test
    public void testGiven1ShouldReturn1() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String result = fizzbuzz.get(1);
        assertEquals("1", result);
    }
}
