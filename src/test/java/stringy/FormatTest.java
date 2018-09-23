package stringy;

import org.junit.Test;

import static org.junit.Assert.*;

public class FormatTest {

    @Test
    public void indentShouldNotCrash() {
        var output = Format.indent("hello\nworld", 2);
        assertEquals("  hello\n  world", output);
    }

    @Test
    public void wordWrapShouldNotCrash() {
        var output = Format.wordWrap("hello world", 5);
        assertEquals("hello\nworld", output);

    }
}