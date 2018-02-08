/**
 * Created by Daniel Hayden on 08/02/2018.
 * Student Number: C00137009
 * Email: dan@sledro.com
 */

import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;
import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.Test;

public class HaydenDanielTestTask1 {

	ArrayList<Period> discountPeriods = new ArrayList<Period>();
	ArrayList<Period> normalPeriods = new ArrayList<Period>();
	
	//Create new Period objects and add to arrays
	public void setup(){
	Period discountPeriod = new Period(8,9);
	discountPeriods.add(discountPeriod);
	
	Period normalPeriod = new Period(11,19);
	normalPeriods.add(normalPeriod);
	}
	
	//Test 1
	@org.junit.Test
    public void normalRateGraterThanZero(){
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(1), new BigDecimal(1), discountPeriods, normalPeriods);
    }
    
	//Test 2
	@org.junit.Test
    public void normalRateLessThanZero(){
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(-1), new BigDecimal(1), discountPeriods, normalPeriods);
    }
    
	//Test 3
	@org.junit.Test
    public void discountRateGraterThanZero(){
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(1), new BigDecimal(1), discountPeriods, normalPeriods);
    }
    
	//Test 4
	@org.junit.Test
    public void discountRateLessThanZero(){
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(1), new BigDecimal(-1), discountPeriods, normalPeriods);
    }
    
    //Test 5
	@org.junit.Test
    public void normalRateGreaterThanDiscountRate(){	
       new Rate(CarParkKind.MANAGEMENT, new BigDecimal(2),new BigDecimal(1),discountPeriods,normalPeriods);
    }
    
    //Test 6
	@org.junit.Test
    public void normalRateLessThanDiscountRate(){	
       new Rate(CarParkKind.MANAGEMENT, new BigDecimal(1),new BigDecimal(2),discountPeriods,normalPeriods);
    }
    
}
