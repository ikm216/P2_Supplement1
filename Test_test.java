import org.junit.*;

public class Test_test {
    @Test
    public void t(){
        test x = new test();
        Assert.assertEquals("Test Test", x.says());
    }
}
