package ro.fasttrackit.recursive;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SumOfIntegersTest {
    SumOfIntegers sumOfIntegers;
    @BeforeEach
    void setup(){
        sumOfIntegers = new SumOfIntegers();
    }

    @Test
    @DisplayName("sum(0) = 0")
    void sum0(){
        Assertions.assertThat(sumOfIntegers.getRecursiveSum(0)).isEqualTo(0);
    }

    @Test
    @DisplayName("sum(10) = 10")
    void sum10(){
        Assertions.assertThat(sumOfIntegers.getRecursiveSum(10)).isEqualTo(55);
    }

    @Test
    @DisplayName("WHEN n is negative THEN throw exception")
    void sumOfNegative(){
        var exception = org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> sumOfIntegers.getRecursiveSum(-13));
        Assertions.assertThat(exception.getMessage()).isEqualTo("n is negative");
    }
}
