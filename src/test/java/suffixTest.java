import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by anthonycapriotti on 3/27/17.
 */
public class suffixTest {
    Suffix suffix;

    @Before
    public void setup(){
        suffix = new Suffix();
    }


    @Test
    public void test1(){
        String one = "outfield, cornfield";
        String expected = "field";
        String actual = suffix.suffix(one);
        Assert.assertEquals(expected,actual);
    }
}
