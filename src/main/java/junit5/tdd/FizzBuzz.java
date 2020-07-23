package junit5.tdd;

public class FizzBuzz {

    public String play(int inputNumber){
        if (inputNumber%15==0)
            return "fizzbuzz";
        if (inputNumber%3==0)
            return "fizz";
        if (inputNumber%5==0)
            return "buzz";
        return String.valueOf(inputNumber);
    }
}
