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
    BigDecimal nullValueBigDecimal;
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
	//Check that if the normal rate is a BigDecimal TYPE, an IllegalArgumentException exception will be thrown.
	@org.junit.Test (expected = IllegalArgumentException.class)
    public void normalRateValidInputType(){
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal("String"), new BigDecimal(1), discountPeriods, normalPeriods);
    }	
	
	//Test 9
	//Check that if the normal rate max value, test will pass
    public void normalRateMaxValue(){
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(Integer.MAX_VALUE), new BigDecimal(1), discountPeriods, normalPeriods);
    }	
    
	//Test 10
	//Check that if normalRate is null, an IllegalArgumentException exception will be thrown.
	@org.junit.Test (expected = NullPointerException.class)
    public void normalRateNull(){
        new Rate(CarParkKind.MANAGEMENT, nullValueBigDecimal, new BigDecimal(1), discountPeriods, normalPeriods);
    }	
	
	//Test 11
	//Check that if discountRate is null, an IllegalArgumentException exception will be thrown.
	@org.junit.Test (expected = NullPointerException.class)
    public void discountRateNull(){
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(1), nullValueBigDecimal, discountPeriods, normalPeriods);
    }	

	//Test 12
	//Check that if the discount rate is a BigDecimal TYPE, an IllegalArgumentException exception will be thrown.
	@org.junit.Test (expected = IllegalArgumentException.class)
    public void discountRateValidInputType(){
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(1), new BigDecimal("String"), discountPeriods, normalPeriods);
    }	
	
	//Test 13
	//Check that if the discount rate max value, test will pass
    public void discountRateMaxValue(){
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(1), new BigDecimal(Integer.MAX_VALUE), discountPeriods, normalPeriods);
    }	
	
	//Test 14
	//Check discount rate > 0
	@org.junit.Test
    public void discountRateGraterThanZero(){
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(1), new BigDecimal(1), discountPeriods, normalPeriods);
    }
    
	//Test 15
	//Check that if the discount rate is negative, an IllegalArgumentException exception will be thrown.
	@org.junit.Test (expected = IllegalArgumentException.class)
    public void discountRateLessThanZero(){
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(1), new BigDecimal(-1), discountPeriods, normalPeriods);
    }
	
	//Test 16
	//Check that if the discount rate = 0 or throw exception
	@org.junit.Test (expected = IllegalArgumentException.class)
    public void discountRateEqualToZero(){
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(1), new BigDecimal(0), discountPeriods, normalPeriods);
    }
    
    //Test 17
	//Check the normal rate is greater than discounted rate
    public void normalRateGreaterThanDiscountRate(){	
       new Rate(CarParkKind.MANAGEMENT, new BigDecimal(2),new BigDecimal(1),discountPeriods,normalPeriods);
    }
    
    //Test 18
	//Check the normal rate is greater than discounted rate. Catch exception if not.
	@org.junit.Test (expected = IllegalArgumentException.class)
    public void normalRateLessThanDiscountRate(){	
       new Rate(CarParkKind.MANAGEMENT, new BigDecimal(1),new BigDecimal(2),discountPeriods,normalPeriods);
    }
	
    //Test 19
	//If normal rate and discount rate have same value, catch exception.
	@org.junit.Test (expected = IllegalArgumentException.class)
    public void normalRateEqualDiscountRate(){	
       new Rate(CarParkKind.MANAGEMENT, new BigDecimal(1),new BigDecimal(1),discountPeriods,normalPeriods);
    }

    
}
