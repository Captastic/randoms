import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by anthonycapriotti on 3/27/17.
 */
public class SuffixAlternateTest {

    SuffixAlternate suffixAlternate;

    @Before
    public void setup(){
        suffixAlternate = new SuffixAlternate();
    }

    @Test
    public void test1(){
        String one = "outfield, cornfield";
        String expected = "field";
        String actual = suffixAlternate.suffixToo(one);
        Assert.assertEquals(expected,actual);
    }
}
