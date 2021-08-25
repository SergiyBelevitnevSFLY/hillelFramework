import org.testng.annotations.Test;
import strategyExample.FlightBase;
import strategyExample.MakeAnOrder;
import strategyExample.MultiCity;
import strategyExample.RoundTrip;

import java.util.HashMap;

public class StrategyTester {


    @Test
    public void strategyTest(){

//        flightBase = new MultiCity();
//        flightBase.chooseFlightAndVerify(fromTo);

        MakeAnOrder makeAnOrder = new MakeAnOrder();
        makeAnOrder.makeOrder(new RoundTrip());
    }
}
