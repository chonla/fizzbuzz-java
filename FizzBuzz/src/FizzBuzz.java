/**
 * Created by chonla on 2/1/2017 AD.
 */
public class FizzBuzz {
    public String get(Integer i) {
        if (i == 3) {
            return "Fizz";
        }
        if (i == 5) {
            return "Buzz";
        }
        return i.toString();
    }
}
