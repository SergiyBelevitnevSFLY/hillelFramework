package strategyExample;

import java.util.HashMap;

public class MakeAnOrder {


    public void makeOrder(FlightBase flightBase){
        HashMap<String, String> fromTo = new HashMap<>();
        flightBase.chooseFlightAndVerify(fromTo);
    }
}
