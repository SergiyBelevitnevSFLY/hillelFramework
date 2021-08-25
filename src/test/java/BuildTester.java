import org.testng.annotations.Test;

public class BuildTester {


    @Test
    public void builderTester(){

        Person person = new Person.Builder()
//                .withName("Justine")
                .withSurName("Langworth")
                .withAge(39)
//                .withWeight(140)
                .withHeight(165)
                .build();

        System.out.println(person.toString());
    }
}
