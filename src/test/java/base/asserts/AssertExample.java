package base.asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertExample{

    @Test
    public void assertExampleTest(){
        String expected = "Awesome";

        String actual = "Awesome2";

        int expectedInt = 5;

//        Assert.assertEquals("Awesome", expected, "Strings are different");


        User user1 = new User("321","qwe",123);
        User user2 = user1;

//        Assert.assertEquals(new User("123","qwe"), new User("321","qwe"));
        Assert.assertSame("", user2);

//        Assert.assertSame(expected, actual);

//        Assert.

//        Assert.



    }
}
