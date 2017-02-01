/**
 * Created by chonla on 2/1/2017 AD.
 */
public class FizzBuzz {
    public String get(Integer i) {
        if (i % 15 == 0) {
            return "FizzBuzz";
        }
        if (isDivisibleBy3(i)) {
            return "Fizz";
        }
        if (i % 5 == 0) {
            return "Buzz";
        }
        return i.toString();
    }

    private Boolean isDivisibleBy3(Integer i) {
        return i % 3 == 0;
    }
}
