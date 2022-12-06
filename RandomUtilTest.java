import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RandomUtilTest
{
    @DataProvider (name = "stringy")
    public Object[][] dpMethod(){
        return new Object[][] {{"1,true"}, {"2,false"},{"-1,true"}};
    }
    @Test (dataProvider = "stringy")
    public void myTest (String val) {
        System.out.println("Passed Parameter Is : " + val);
    }
}
