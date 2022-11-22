import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class RandomUtilTest
{
    @Test(dataProvider="stringy")
    public void stringTest(int n, boolean flag)
    {
        System.out.println(n+""+flag);
    }

    @DataProvider(name = "stringy")
    public Object[][] getData()
    {
        Object[][] data = {{"3", "True"},{"3", "false"},,{"-6", "true"}};
        return data;
    }

}
