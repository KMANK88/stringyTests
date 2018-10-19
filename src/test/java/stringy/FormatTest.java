package stringy;

import org.junit.Test;

import static org.junit.Assert.*;

public class FormatTest {

	@Test
    public void twoIndentMultipleLines() {
        var output = Format.indent("hello\nworld", 2);
        assertEquals("  hello\n  world", output);
    }
	
	@Test
    public void oneLine3Spaces() {
        var output = Format.indent("hello there", 3);
        assertEquals("   hello there", output);
    }
	@Test
    public void noSpaces() {
        var output = Format.indent("hello there", 0);
        assertEquals("hello there", output);
    }
	@Test
    public void twoIndentOnMultipleLines() {
        var output = Format.indent("hello\n\nthere", 2);
        assertEquals("  hello\n  \n  there", output);
    }
	@Test
    public void multipleLinesNoIndent() {
        var output = Format.indent("hello\n\nthere", 0);
        assertEquals("hello\n\nthere", output);
    }
	@Test
    public void spaceInfrontofIndent() {
        var output = Format.indent(" hello\nthere", 1);
        assertEquals("  hello\n there", output);
    }
	//============================================
	//This function does not work--look into or it is a giant bug. 
    @Test
    public void sinplewordwrap() {
        var output = Format.wordWrap("hello world", 5);
        assertEquals("hello\nworld", output);

  } 
    
    
    @Test
    public void differentLevelsOfStringsWrap() {
        var output = Format.wordWrap("aa aaa aaaaa aaaaaa", 6);
        assertEquals("aa aaa\naaaaa\naaaaaa", output);

  } 
  
    
    @Test
    public void stringlengthTwooffFromSpaceWrap() {
        var output = Format.wordWrap("aaaa aaaaa aaaaaa", 6);
        assertEquals("aaaa\naaaaa\naaaaaa", output);

  } 
    
    @Test
    public void stringlengthOneoffFromSpaceWrap() {
        var output = Format.wordWrap("aaaaa aaaaa aaaaaa", 6);
        assertEquals("aaaaa\naaaaa\naaaaaa", output);

  } 
    @Test
    public void StringWrapGoesIntoSecondWordHalfWayThrough() {
        var output = Format.wordWrap("aaa aaa aaaaa aaaaaa", 6);
        assertEquals("aaa\naaa\naaaaa\naaaaaa", output);

  } 
    @Test
    public void StringWrapWithSpaces() {
        var output = Format.wordWrap("aa aaa  a aaaaaa", 9);
        assertEquals("aa aaa  a\naaaaaa", output);

  } 
    @Test
    public void StringWrapOnOneLine() {
        var output = Format.wordWrap("aa aaa  a aaaaaa", 99);
        assertEquals("aa aaa  a aaaaaa", output);

  } 
    
    @Test
    public void StringWrapLengthLineOne() {
        var output = Format.wordWrap("a aa aaa aaaa", 1);
        assertEquals("a\naa\naaa\naaaa", output);
        //allwords will go to new line because they exceed 1 linelength. 

  } 
    
    @Test
    public void WrapStartingWithSpaces() {
        var output = Format.wordWrap("      Yes    Nooo", 5);
        assertEquals("Yes  \nNooo", output);

  } 
 
    
    @Test
    public void WrapEndinginSpace() {
        var output = Format.wordWrap("Yoyo what k    ", 3);
        assertEquals("Yoyo\nwhat\nk", output);

  } 
}