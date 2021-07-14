package base.asserts;

import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class AssertJExample {

    @Test
    public void assertJStringExample() {

        String stringToAssert = "SUMMER";

        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat("Summer2020")
                .isEqualTo(stringToAssert)
                .hasSameSizeAs("Spring")
                .isBlank()
                .containsIgnoringCase(stringToAssert)
                .isNotEqualTo(stringToAssert)
        ;
//                .hasSameSizeAs("Spring");


//        softAssertions.assertAll();

    }

    @Test
    public void assertJExamples() {

//        assertThat(20).as("The int should be greater than, but not").isGreaterThan(30);

        List<User> listOfUsers = Arrays.asList(
                new User("0786", "login", 123),
                new User("Qwerty", "login2", 345),
                new User("Ytrewq", "lkjhgf", 456),
                new User("0000", "HillelUser", 567)
        );

        int[] intArray = {1, 4, 6, 8, 90};

        assertThat(intArray).contains(4);

//        assertThat(listOfUsers).usingRecursiveComparison().contains(new User("0000", "HillelUser", 567)).usingRecursiveComparison();

//        assertThat(listOfUsers).isInstanceOf(listOfUsers

        User user1 = new User("0001", "HillelUser", 789);
        User user2 = new User("0000", "HillelUser", 567);

        assertThat(user1)
                .usingRecursiveComparison()
                .ignoringFields("id","password")
                .isEqualTo(user2);

    }

    @Test
    public void assertJExceptions(){
        NullPointerException cause = new NullPointerException("boom!");
        Throwable throwable = new Throwable(cause);
        assertThat(throwable)
                .hasCauseInstanceOf(NullPointerException.class)
                .hasMessageContaining("boom123");




    }
}