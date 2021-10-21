package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int order) {
        if (order%105 == 0) return returnFizz().concat(returnBuzz()).concat(returnWhizz());
        if (order%35 == 0) return returnBuzz().concat(returnWhizz());
        if (order%21 == 0) return returnFizz().concat(returnWhizz());
        if (order%15 == 0) return returnFizz().concat(returnBuzz());
        if (order%7 == 0) return returnWhizz();
        if (order%5 == 0) return returnBuzz();
        if (order%3 == 0) return returnFizz();
        return String.valueOf(order);

    }
    public String returnFizz(){
        return "Fizz";
    }
    public String returnBuzz(){
        return "Buzz";
    }
    public String returnWhizz(){
        return "Whizz";
    }
}
