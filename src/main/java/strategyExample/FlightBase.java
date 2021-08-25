package strategyExample;

import java.util.HashMap;

public interface FlightBase {


    void chooseFlightAndVerify(HashMap<String, String> flightDetails);
}
