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

        Integer result3 = Convertor.convertStringToInteger("-32767");
        Assert.assertEquals(-32767, result3.intValue());

        Integer result4 = Convertor.convertStringToInteger("1630");
        Assert.assertEquals(1630, result4.intValue());

        Integer result5 = Convertor.convertStringToInteger("2768");
        Assert.assertEquals(2768, result5.intValue());
    }

    @Test(expected = Exception.class)
    public void convertStringToIntegerTest_failString() throws Exception {
        Integer result = Convertor.convertStringToInteger("32 760");
        Assert.assertEquals(32768, result.intValue());

        Integer result2 = Convertor.convertStringToInteger("-1p2");
        Assert.assertEquals(-32768, result2.intValue());

        Integer result3 = Convertor.convertStringToInteger("565 ");
        Assert.assertEquals(565, result3.intValue());
    }

    @Test(expected = Exception.class)
    public void convertStringToIntegerTest_failInteger() throws Exception {
        Integer result = Convertor.convertStringToInteger("56g5");
        Assert.assertEquals(32768, result.intValue());

        Integer result2 = Convertor.convertStringToInteger("-32768");
        Assert.assertEquals(-32768, result2.intValue());
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
