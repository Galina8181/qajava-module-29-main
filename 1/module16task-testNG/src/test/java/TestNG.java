import org.testng.annotations.*;

public class TestNG {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite!");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Testing!");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class!");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method!");
    }

    @Test
    public void test() {
        System.out.println("Testing!");
    }

    @Test
    public void test2() {
        System.out.println("Testing 2!");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method!");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class!");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Testing!");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite!");
    }
}
