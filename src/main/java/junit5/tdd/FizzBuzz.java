package junit5.tdd;

public class FizzBuzz {

    public String play(int inputNumber){
        if (inputNumber%15==0)
            return "fizzbuzz";
        if (inputNumber%21==0)
            return "fizzwhizz";
        if (inputNumber%35==0)
            return "buzzwhizz";
        if (inputNumber%3==0)
            return "fizz";
        if (inputNumber%5==0)
            return "buzz";
        if (inputNumber%7==0)
            return "whizz";
        return String.valueOf(inputNumber);
    }
}
