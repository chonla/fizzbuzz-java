/**
 * Created by chonla on 2/1/2017 AD.
 */
public class FizzBuzz {
    public String get(Integer i) {
        if (isDivisibleBy3(i) && isDivisibleBy5(i)) {
            return "FizzBuzz";
        }
        if (isDivisibleBy3(i)) {
            return "Fizz";
        }
        if (isDivisibleBy5(i)) {
            return "Buzz";
        }
        return i.toString();
    }

    private Boolean isDivisibleBy3(Integer i) {
        return i % 3 == 0;
    }

    private Boolean isDivisibleBy5(Integer i) {
        return i % 5 == 0;
    }
}
