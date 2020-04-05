package ro.fasttrackit.recursive;

public class Palindrome {
    public String reverse(String phrase) {
        if (phrase == null) throw new IllegalArgumentException();
        if (phrase.length() > 1) {
            return phrase.charAt(phrase.length() - 1) + reverse(phrase.substring(0, phrase.length() - 1));
        } else {
            return phrase;
        }
    }

    public boolean isPalindrom2(String phrase) {
        if (phrase == null) throw new IllegalArgumentException();

        if (phrase.length() == 0 || phrase.length() == 1) return true;
        if (phrase.charAt(0) == phrase.charAt(phrase.length() - 1)) {
            return isPalindrom2(phrase.substring(1, phrase.length() - 1));
        }
        return false;
    }

    public boolean isPalindrom(String phrase) {
        String reverse = reverse(phrase);
        if (reverse == phrase) {
            return true;
        } else {
            return false;
        }
    }
}
