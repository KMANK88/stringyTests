package stringy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CaseTest {


    
	//=====================1st test
    @Test
    public void lowerFirstCapLastAlternatingCase() {
        var output = Case.alternating("helloTHERE");
        assertEquals("hElLoThErE", output);
        //normal works fine
    }
    
    @Test
    public void CapFirstLowerLastAlternatingCase() {
        var output = Case.alternating("HELLOthere");
        assertEquals("HeLlOtHeRe", output);
        //reverse capital letters.
    }
    @Test
    public void firstLowerCaseRestCapAlternatingCase() {
        var output = Case.alternating("mYBABYBOY");
        assertEquals("mYbAbYbOy", output);
        //first not capital rest are
    }
    @Test
    public void firstCapRestLowerCaseAlternatingCase() {
        var output = Case.alternating("Yoarecool");
        assertEquals("YoArEcOoL", output);
        //first capital no others
    }
    
    @Test
    public void allLowerAlternatingCase() {
        var output = Case.alternating("ab");
        assertEquals("aB", output);
        //no capital
    }
    @Test
    public void AllCapitalAlternatingCase() {
        var output = Case.alternating("AA");
        assertEquals("Aa", output);
        //all capital
    }
    /*
    @Test
    public void alternatingDoesNotCrash6() {
        var output = Case.alternating("");
        assertEquals("", output);
        //fails on purpose for empty string.
    }
    */
    
  
    @Test
    public void withSlashAlternatingCase() {
        var output = Case.alternating("A/a");
        assertEquals("A/A", output);
        //works, because it is start of new string, so next one will fail. 
    }
  
    
   
    
    
//============================================
    @Test
    public void twoCapitalWordsSentenceTransform() {
        var output = Case.sentence("Hello World");
        assertEquals("Hello world", output);
    }//upper case turn into lowercase
    @Test
    public void FirstCapsecondLowerCaseSentenceTransform() {
        var output = Case.sentence("Hello there");
        assertEquals("Hello there", output);
    }
    
    public void AllCapitalWordsSentenceTransform() {
        var output = Case.sentence("Hello There General");
        assertEquals("Hello there general", output);
    }
    public void oneWordTwocapitalsSentenceTransform() {
        var output = Case.sentence("HelloThere");
        assertEquals("Hellothere", output);
    }//no spaces

    public void allCapSentenceTransformSentenceTransform() {
        var output = Case.sentence("FTC");
        assertEquals("Ftc", output);
    }
    public void AllCapWithSpacesSentenceTransform() {
        var output = Case.sentence("F T C");
        assertEquals("F t c", output);
    }
    public void sentenceWith2CapSentenceTransform() {
        var output = Case.sentence("How are you Doing");
        assertEquals("How are you doing", output);
    }
    public void twoCapWithPunctuationSentenceTransform() {
        var output = Case.sentence("Hi. You ok?");
        assertEquals("Hi. you ok?", output);
    }
    //=================================================
    @Test
    public void twoLowerCaseTitle() {
        var output = Case.title(("hello world"));
        assertEquals("Hello World", output);
    }
    
    @Test
    public void firstLettersLowerCaseTitle() {
        var output = Case.title(("hI tHERE"));
        assertEquals("HI THERE", output);
    }

    @Test
    public void sentenceWithTwoCapTitle() {
        var output = Case.title(("I do say this is quite Fun."));
        assertEquals("I Do Say This Is Quite Fun.", output);
    }
/*
    @Test
    public void titleDoesNotCrash3() {
        var output = Case.title(("moore spaces  is   great"));
        assertEquals("Moore Spaces  Is   Great", output);
        //this fails when there is more than one space.
    }
    */
    @Test
    public void allLowerCaseTitle() {
        var output = Case.title(("moore spaces is great"));
        assertEquals("Moore Spaces Is Great", output);
        //this fails when there is more than one space.
    }
    @Test
    public void allLowerCaseLettersTitle() {
        var output = Case.title(("aa bb cccDd"));
        assertEquals("Aa Bb CccDd", output);
        //this fails when there is more than one space.
    }
    
}