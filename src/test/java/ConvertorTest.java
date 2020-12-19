import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ConvertorTest {

    @Test
    public void convertStringToIntegerTest(){
        Assert.assertTrue(Convertor.onlyNumber("123"));
        Assert.assertTrue(Convertor.onlyNumber("-12"));
        Assert.assertTrue(Convertor.onlyNumber("100"));
        Assert.assertTrue(Convertor.onlyNumber("3"));
        Assert.assertTrue(Convertor.onlyNumber("-8"));
        Assert.assertTrue(Convertor.onlyNumber("2s3"));
    }

    @Test
    public void onlyNumberTest(){
        Assert.assertTrue(Convertor.onlyNumber("123"));
        Assert.assertTrue(Convertor.onlyNumber("-12"));
        Assert.assertTrue(Convertor.onlyNumber("100"));
        Assert.assertTrue(Convertor.onlyNumber("3"));
        Assert.assertTrue(Convertor.onlyNumber("-8"));
        Assert.assertTrue(Convertor.onlyNumber("2s3"));
    }
}
