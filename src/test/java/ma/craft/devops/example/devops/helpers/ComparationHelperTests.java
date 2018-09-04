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
}
