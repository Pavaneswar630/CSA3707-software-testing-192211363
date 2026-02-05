package junit;

import org.junit.Test;
import static org.junit.Assert.*;
public class VowelConsonantCountTest {
    public int[] countVowelsConsonants(String s) {
        int vowels = 0;
        int consonants = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }
    @Test
    public void testVowelConsonantCount() {
        int[] result = countVowelsConsonants("hello");
        assertEquals(2, result[0]);
        assertEquals(3, result[1]);
    }
    @Test
    public void testOnlyVowels() {
        int[] result = countVowelsConsonants("aeiou");
        assertEquals(5, result[0]);
        assertEquals(0, result[1]);
    }
    @Test
    public void testOnlyConsonants() {
        int[] result = countVowelsConsonants("bcdf");
        assertEquals(0, result[0]);
        assertEquals(4, result[1]);
    }
}