import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Rule;

public class RnaTranscriptionTest {

    /*
    version: 2.0.0
     */

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private RnaTranscription rnaTranscription;

    @Before
    public void setUp() {
        rnaTranscription = new RnaTranscription();
    }

    @Test
    public void testRnaTranscriptionOfEmptyDnaIsEmptyRna() {
        Assert.assertEquals("", rnaTranscription.transcribe(""));
    }

    @Test
    public void testRnaTranscriptionOfCytosineIsGuanine() {
        Assert.assertEquals("G", rnaTranscription.transcribe("C"));
    }

    @Test
    public void testRnaTranscriptionOfGuanineIsCytosine() {
        Assert.assertEquals("C", rnaTranscription.transcribe("G"));
    }

    @Test
    public void testRnaTranscriptionOfThymineIsAdenine() {
        Assert.assertEquals("A", rnaTranscription.transcribe("T"));
    }

    @Test
    public void testRnaTranscriptionOfAdenineIsUracil() {
        Assert.assertEquals("U", rnaTranscription.transcribe("A"));
    }

    @Test
    public void testRnaTranscription() {
        Assert.assertEquals("UGCACCAGAAUU", rnaTranscription.transcribe("ACGTGGTCTTAA"));
    }

    @Test
    public void testRnaTranscriptionOfRnaThrowsAnError() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Invalid input");
        rnaTranscription.transcribe("U");
    }

    @Test
    public void testRnaTranscriptionOfInvalidInputThrowsAnError() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Invalid input");
        rnaTranscription.transcribe("BFV");
    }

    @Test
    public void testRnaTranscriptionOfPartiallyInvalidInput() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Invalid input");
        rnaTranscription.transcribe("GCVV");
    }
}
