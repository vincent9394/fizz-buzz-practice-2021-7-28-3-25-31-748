package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_order_when_count_off_given_order_number() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        //given
        int order =1;
        String expected = "1";

        //when
        String actual = fizzBuzz.countOff(order);

        //then
        assertEquals(expected,actual);

    }
}
