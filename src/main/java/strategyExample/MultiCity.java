package strategyExample;

import java.util.HashMap;

public class MultiCity implements FlightBase{

    @Override
    public void chooseFlightAndVerify(HashMap<String, String> flightDetails) {
        System.out.println("You are on multicity context");
    }
}
