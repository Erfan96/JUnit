import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ConvertorTest {

    @Test
    public void convertStringToIntegerTest() throws Exception {
        Integer result = Convertor.convertStringToInteger("300");
        Assert.assertEquals(300, result.intValue());

        Integer result2 = Convertor.convertStringToInteger("32767");
        Assert.assertEquals(32767, result2.intValue());

        //Integer result3 = Convertor.convertStringToInteger("32768");
        // Assert.assertEquals(32768, result3.intValue());

    }

    @Test
    public void onlyNumberTest() {
        Assert.assertTrue(Convertor.onlyNumber("123"));
        Assert.assertTrue(Convertor.onlyNumber("-12"));
        Assert.assertTrue(Convertor.onlyNumber("100"));
        Assert.assertTrue(Convertor.onlyNumber("3"));
        Assert.assertTrue(Convertor.onlyNumber("-8"));
    }

    @Test(expected = AssertionError.class)
    public void onlyNumberTest_False() {
        Assert.assertTrue(Convertor.onlyNumber("12 3"));
        Assert.assertTrue(Convertor.onlyNumber("-1 2"));
        Assert.assertTrue(Convertor.onlyNumber("1.00"));
        Assert.assertTrue(Convertor.onlyNumber("3sg"));
        Assert.assertTrue(Convertor.onlyNumber("-8p"));
    }
}
