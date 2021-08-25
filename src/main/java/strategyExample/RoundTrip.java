package strategyExample;

import java.util.HashMap;

public class RoundTrip implements FlightBase{
    @Override
    public void chooseFlightAndVerify(HashMap<String, String> flightDetails) {
        System.out.println("You are on round trip context");
    }
}
