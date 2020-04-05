package ro.fasttrackit.recursive;

public class SumOfDigits {
    public int getSum(int number) {
        if (number < 0) throw new IllegalArgumentException();
        if (number / 10 == 0 && number % 10 == 0) {
            return 0;
        } else {
            return number % 10 + getSum(number / 10);
        }
    }
}
