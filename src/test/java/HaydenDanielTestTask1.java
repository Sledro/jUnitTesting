/**
 * Created by Daniel Hayden on 08/02/2018.
 * Student Number: C00137009
 * Email: dan@sledro.com
 */

import java.math.BigDecimal;
import java.util.ArrayList;

public class HaydenDanielTestTask1 {

	ArrayList<Period> discountPeriods = new ArrayList<Period>();
	ArrayList<Period> normalPeriods = new ArrayList<Period>();
	
	//Create new Period objects and add to arrays
	public void setup(){
	Period discountPeriod = new Period(17,18);
	discountPeriods.add(discountPeriod);
	
	Period normalPeriod = new Period(14,17);
	normalPeriods.add(normalPeriod);
	}
	
	//normalRate > 0
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void normalRateGraterThanZero(){
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(2), new BigDecimal(0), discountPeriods, normalPeriods);
    }
    
    //normalRate > discountRate
    @org.junit.Test
    public void normalRateGreaterThanDiscountRate(){	
       new Rate(CarParkKind.MANAGEMENT, new BigDecimal(6),new BigDecimal(5),discountPeriods,normalPeriods);
    }
    
}
