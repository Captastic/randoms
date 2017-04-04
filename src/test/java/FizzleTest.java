import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by anthonycapriotti on 3/27/17.
 */
public class FizzleTest {
    Fizzle fizzle;

    @Before
    public void setup(){
        fizzle = new Fizzle();
    }

    @Test
    public void testOne(){
        String s = "122456770";
        String expected = "12*2*4567-70";
        String actual = fizzle.fizzBuzz(s);
        Assert.assertEquals(expected,actual);
    }
}
