/**
 * Created by Daniel Hayden on 08/02/2018.
 * Student Number: C00137009
 * Email: dan@sledro.com
 */

import static org.junit.Assert.*;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.ArrayList;

public class HaydenDanielTestTask1 {

	//Test rate contains valid arguments
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void nullValuesInputted() throws Exception {
    	
    		BigDecimal normalRate = new BigDecimal("2.00");
    		BigDecimal discountedRate = new BigDecimal("4.00");
    		ArrayList<Period> discountPeriods = new ArrayList<Period>();
    		ArrayList<Period> normalPeriods = new ArrayList<Period>();
    		Period discountPeriod1 = new Period(3,5);
    		Period discountPeriod2 = new Period(5,6);
    		discountPeriods.add(discountPeriod1);
    		discountPeriods.add(discountPeriod2);
        Rate std = new Rate(CarParkKind.STAFF, normalRate, discountedRate, discountPeriods, normalPeriods);
    }
    

}
