import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {

    @DataProvider(name = "addSub-data-provider")
        public Object[][] dpMethod() {
        return new Object[][]{{2, 3, 5}, {5, 7, 12}};
    }

    @DataProvider(name = "divMul-data-provider")
    public Object[][] divisionDPMethod() {
        return new Object[][]{{10, 2, 5}, {15, 3, 5}};
    }

    @DataProvider(name = "remainder-data-provider")
    public Object[][] remainderDPMethod() {
        return new Object[][]{{7, 2, 1}, {20, 7, 6}};
    }

    @Test (dataProvider = "addSub-data-provider", groups = {"addition"})
    public void should_add_correctly(int a, int b, int sum) {
        int result = a + b;
        Assert.assertEquals(sum, result);
    }

    @Test (dataProvider = "addSub-data-provider", groups = {"subtraction"})
    public void should_subtract_correctly(int a, int b, int sum) {
        int result = sum - a;
        Assert.assertEquals(b, result);
    }

    @Test (dataProvider = "divMul-data-provider", groups = {"division"})
    public void should_divide_correctly(int sum, int a, int b) {
        int result = sum / a;
        Assert.assertEquals(b, result);
    }

    @Test (dataProvider = "divMul-data-provider", groups = {"multiplication"})
    public void should_multiply_correctly(int sum, int a, int b) {
        int result = a * b;
        Assert.assertEquals(sum, result);
    }

    @Test (dataProvider = "remainder-data-provider", groups = {"remainder"})
    public void should_find_remainder_correctly(int sum, int a, int remainder) {
        int result = sum % a;
        Assert.assertEquals(remainder, result);
    }



}
