package ma.craft.devops.example.devops.helpers;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ComparationHelperTests {


    @Test
    public void shouldAlwaysReturnTrueWhenPassingHello(){
        Assert.assertTrue(ComparationHelper.isHello("Hello"));
    }


    @Test
    public void shouldReturnHelloAggregatedWithPassedValue(){
        Assert.assertEquals("Hello World", ComparationHelper
                        .concatenateHelloWith(" World"));
    }

    @Test
    public void shouldReturnHelloAggregatedWithNullValue(){
        Assert.assertEquals("Hello", ComparationHelper
                .concatenateHelloWith(null));
    }

    @Test
    public void shouldReturnTrueWhenBothValuesAreEqual(){
        Assert.assertTrue(ComparationHelper.compareLongs(0L, (long)0.000000));
    }

    @Test
    public void shouldReturnTrueWhenBothValuesAreLikelyEqual(){
        Assert.assertTrue(ComparationHelper.compareLongs(new Long(10), (long)10));
    }
}
