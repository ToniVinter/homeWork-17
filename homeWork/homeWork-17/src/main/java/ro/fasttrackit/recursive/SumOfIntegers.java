package ro.fasttrackit.recursive;

public class SumOfIntegers {
    public int getRecursiveSum(int n) {
        if (n < 0) throw new IllegalArgumentException("n is negative");
        return n <= 1 ? n : getRecursiveSum(n - 1) + n;
    }
}
