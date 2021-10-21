package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int order) {
//        if (order%105 == 0) return returnFizz().concat(returnBuzz()).concat(returnWhizz());
//        if (order%35 == 0) return returnBuzz().concat(returnWhizz());
//        if (order%21 == 0) return returnFizz().concat(returnWhizz());
//        if (order%15 == 0) return returnFizz().concat(returnBuzz());
//        if (order%7 == 0) return returnWhizz();
//        if (order%5 == 0) return returnBuzz();
//        if (order%3 == 0) return returnFizz();
        StringBuilder result = new StringBuilder();

        if (order % 3 == 0) {
            result.append(returnFizz());
        }
        if (order % 5 == 0) {
            result.append(returnBuzz());
        }
        if (order % 7 == 0) {
            result.append(returnWhizz());
        }
//        if (result.length()==0){
//            return String.valueOf(order);
//        } else {
//            return String.valueOf(result);
//        }
        return (result.length() == 0) ? String.valueOf(order) : String.valueOf(result);

    }

    public String returnFizz() {
        return "Fizz";
    }

    public String returnBuzz() {
        return "Buzz";
    }

    public String returnWhizz() {
        return "Whizz";
    }
}
