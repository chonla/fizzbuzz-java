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

    @Test
    public void testGiven3ShouldReturnFizz() {
        String result = fizzbuzz.get(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void testGiven6ShouldReturnFizz() {
        String result = fizzbuzz.get(6);
        assertEquals("Fizz", result);
    }

    @Test
    public void testGiven5ShouldReturnBuzz() {
        String result = fizzbuzz.get(5);
        assertEquals("Buzz", result);
    }

    @Test
    public void testGiven10ShouldReturnBuzz() {
        String result = fizzbuzz.get(10);
        assertEquals("Buzz", result);
    }

    @Test
    public void testGiven15ShouldReturnFizzBuzz() {
        String result = fizzbuzz.get(15);
        assertEquals("FizzBuzz", result);
    }
}
