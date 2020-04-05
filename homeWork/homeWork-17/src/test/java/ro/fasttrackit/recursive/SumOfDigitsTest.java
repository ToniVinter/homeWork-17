package ro.fasttrackit.recursive;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SumOfDigitsTest {
    SumOfDigits sumOfDigits;

    @BeforeEach
    void setup() {
        sumOfDigits = new SumOfDigits();
    }

    @Test
    @DisplayName("getSum(10) = 1 ")
    void getSum10() {
        Assertions.assertThat(sumOfDigits.getSum(10)).isEqualTo(1);
    }
    @Test
    @DisplayName("getSum(555) = 15 ")
    void getSum555() {
        Assertions.assertThat(sumOfDigits.getSum(555)).isEqualTo(15);
    }
    @Test
    @DisplayName("getSum(0) = 0 ")
    void getSum0() {
        Assertions.assertThat(sumOfDigits.getSum(0)).isEqualTo(0);
    }

    @Test
    @DisplayName("getSum(-10) = exception")
    void getSumOfNeg() {
        org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> sumOfDigits.getSum(-10));
    }


}
