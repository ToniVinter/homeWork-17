package ro.fasttrackit.recursive;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PalindromeTest {
    Palindrome palindrome;
    @BeforeEach
    void setup(){
        palindrome = new Palindrome();
    }
    @Test
    @DisplayName("revers(copil) = lipoc ")
    void getRevers(){
        var phrase = "copil";
        assertThat(palindrome.reverse(phrase)).isEqualTo("lipoc");
    }

    @Test
    @DisplayName("reverse(null) = exception")
    void getReversOfNull(){
        org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> palindrome.reverse(null));
    }

    @Test
    @DisplayName("isPalindrom(mam) == true")
    void isPalindromTest(){
        System.out.println(palindrome.reverse("mam"));
        assertThat(palindrome.isPalindrom("mam")).isEqualTo(true);
    }

    @Test
    @DisplayName("isPalindrom(paste) = false")
    void isPalindromTest2(){
        System.out.println(palindrome.reverse("paste"));
        assertThat(palindrome.isPalindrom("paste")).isEqualTo(false);
    }

        @Test
    @DisplayName("isPalindrom(apa) = false")
    void isPalindrom2(){
        assertThat(palindrome.isPalindrom2("apa")).isEqualTo(true);
    }

}
