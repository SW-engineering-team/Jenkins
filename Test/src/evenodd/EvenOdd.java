package evenodd;

public class EvenOdd {

    public String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "짝수";
        }
        return "홀수";
    }
}