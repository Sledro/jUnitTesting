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
	
	Period normalPeriod = new Period(9,21);
	normalPeriods.add(normalPeriod);
	}
	
	//Test 1
	//Check that STAFF is valid and constructor runs
	@org.junit.Test
    public void staffEnum(){
        new Rate(CarParkKind.STAFF, new BigDecimal(1), new BigDecimal(1), discountPeriods, normalPeriods);
    }
    
	//Test 2
	//Check that STUDENT is valid and constructor runs
    @org.junit.Test
    public void studentEnum(){
        new Rate(CarParkKind.STUDENT, new BigDecimal(1), new BigDecimal(1), discountPeriods, normalPeriods);
    }
    
	//Test 3
	//Check that MANAGEMENT is valid and constructor runs
    @org.junit.Test
    public void managementEnum(){
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(1), new BigDecimal(1), discountPeriods, normalPeriods);
    }
    
	//Test 4
	//Check that VISITOR is valid and constructor runs
    @org.junit.Test
    public void visitorEnum(){
        new Rate(CarParkKind.VISITOR, new BigDecimal(1), new BigDecimal(1), discountPeriods, normalPeriods);
    }
	
	//Test 5
	//Check that the normalRate > 0.
	@org.junit.Test
    public void normalRateGraterThanZero(){
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(1), new BigDecimal(1), discountPeriods, normalPeriods);
    }
    
	//Test 6
	//Check that if the normal rate is negative, an IllegalArgumentException exception will be thrown.
	@org.junit.Test (expected = IllegalArgumentException.class)
    public void normalRateLessThanZero(){
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(-1), new BigDecimal(1), discountPeriods, normalPeriods);
    }
	
	//Test 7
	//Check that if the normal rate is = 0, an IllegalArgumentException exception will be thrown.
	@org.junit.Test (expected = IllegalArgumentException.class)
    public void normalRateEqualToZero(){
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(0), new BigDecimal(1), discountPeriods, normalPeriods);
    }
    
	//Test 8
	//Check discount rate > 0
	@org.junit.Test
    public void discountRateGraterThanZero(){
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(1), new BigDecimal(1), discountPeriods, normalPeriods);
    }
    
	//Test 9
	@org.junit.Test (expected = IllegalArgumentException.class)
    public void discountRateLessThanZero(){
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(1), new BigDecimal(-1), discountPeriods, normalPeriods);
    }
    
    //Test 10
	@org.junit.Test
    public void normalRateGreaterThanDiscountRate(){	
       new Rate(CarParkKind.MANAGEMENT, new BigDecimal(2),new BigDecimal(1),discountPeriods,normalPeriods);
    }
    
    //Test 11
	@org.junit.Test
    public void normalRateLessThanDiscountRate(){	
       new Rate(CarParkKind.MANAGEMENT, new BigDecimal(1),new BigDecimal(2),discountPeriods,normalPeriods);
    }
	
    //Test 12
	@org.junit.Test
    public void normalRateEqualDiscountRate(){	
       new Rate(CarParkKind.MANAGEMENT, new BigDecimal(1),new BigDecimal(1),discountPeriods,normalPeriods);
    }

    
}
