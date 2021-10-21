package tdd.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_return_order_when_count_off_given_order_number() {


        //given
        int order = 1;
        String expected = "1";

        //when
        String actual = fizzBuzz.countOff(order);

        //then
        assertEquals(expected, actual);

    }

    @Test
    public void should_return_Fizz_when_count_off_given_order_number_multiple_of_3() {
        //given
        int order = 3;
        String expected = "Fizz";

        // when
        String actual = fizzBuzz.countOff(order);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_Buzz_when_count_off_given_order_number_multiple_of_5() {
        //given
        int order = 5;
        String expected = "Buzz";

        // when
        String actual = fizzBuzz.countOff(order);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_Whizz_when_count_off_given_order_number_multiple_of_7() {
        //given
        int order = 7;
        String expected = "Whizz";

        // when
        String actual = fizzBuzz.countOff(order);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_FizzBuzz_when_count_off_given_order_number_multiple_of_15() {
        //given
        int order = 15;
        String expected = "FizzBuzz";

        // when
        String actual = fizzBuzz.countOff(order);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_FizzWhizz_when_count_off_given_order_number_multiple_of_21() {
        //given
        int order = 21;
        String expected = "FizzWhizz";

        // when
        String actual = fizzBuzz.countOff(order);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_FizzBuzz_when_count_off_given_order_number_multiple_of_35() {
        //given
        int order = 35;
        String expected = "BuzzWhizz";

        // when
        String actual = fizzBuzz.countOff(order);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_FizzBuzz_when_count_off_given_order_number_multiple_of_105() {
        //given
        int order = 105;
        String expected = "FizzBuzzWhizz";

        // when
        String actual = fizzBuzz.countOff(order);

        //then
        assertEquals(expected, actual);
    }
}
