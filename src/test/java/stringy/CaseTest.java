package stringy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CaseTest {

    @Test
    public void alternatingDoesNotCrash() {
        var output = Case.alternating("aaAA");
        assertEquals("aAaA", output);
    }

    @Test
    public void sentenceDoesNotCrash() {
        var output = Case.sentence("Hello World");
        assertEquals("Hello world", output);
    }

    @Test
    public void titleDoesNotCrash() {
        var output = Case.title(("hello world"));
        assertEquals("Hello World", output);
    }
}