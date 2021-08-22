package lesson30;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class FakerExample {


    @Test
    public void fakerExample() {

        Faker faker = new Faker();

        Address address = faker.address();

        System.out.println("fake data " + faker.book().genre());
        System.out.println("fake data " + faker.app().name());
        System.out.println("fake data " + faker.animal().name() + System.currentTimeMillis());

        String fakeColor = "sky blue";
        String fakeBookTitle = "The Millstone";
    }
}
