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
    Period period;
	int i;
	int x;
	
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
        new Rate(CarParkKind.STAFF, new BigDecimal(2), new BigDecimal(1), discountPeriods, normalPeriods);
    }
    
	//Test 2
	//Check that STUDENT is valid and constructor runs
    @org.junit.Test
    public void studentEnum(){
        new Rate(CarParkKind.STUDENT, new BigDecimal(2), new BigDecimal(1), discountPeriods, normalPeriods);
    }
    
	//Test 3
	//Check that MANAGEMENT is valid and constructor runs
    @org.junit.Test
    public void managementEnum(){
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(2), new BigDecimal(1), discountPeriods, normalPeriods);
    }
    
	//Test 4
	//Check that VISITOR is valid and constructor runs
    @org.junit.Test
    public void visitorEnum(){
        new Rate(CarParkKind.VISITOR, new BigDecimal(2), new BigDecimal(1), discountPeriods, normalPeriods);
    }
	
	//Test 5
	//Check that the normalRate > 0.
	@org.junit.Test
    public void normalRateGraterThanZero(){
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(2), new BigDecimal(1), discountPeriods, normalPeriods);
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
	@org.junit.Test
    public void normalRateMaxValue(){
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(Integer.MAX_VALUE), new BigDecimal(1), discountPeriods, normalPeriods);
    }	
    
	//Test 10
	//Check that if normalRate is null, an IllegalArgumentException exception will be thrown.
	@org.junit.Test (expected = IllegalArgumentException.class)
    public void normalRateNull(){
        new Rate(CarParkKind.MANAGEMENT, nullValueBigDecimal, new BigDecimal(1), discountPeriods, normalPeriods);
    }	
	
	//Test 11
	//Check that if discountRate is null, an IllegalArgumentException exception will be thrown.
	@org.junit.Test (expected = IllegalArgumentException.class)
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
	@org.junit.Test (expected = IllegalArgumentException.class)
    public void discountRateMaxValue(){
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(2), new BigDecimal(Integer.MAX_VALUE), discountPeriods, normalPeriods);
    }	
	
	//Test 14
	//Check discount rate > 0
	@org.junit.Test
    public void discountRateGraterThanZero(){
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(2), new BigDecimal(1), discountPeriods, normalPeriods);
    }
    
	//Test 15
	//Check that if the discount rate is negative, an IllegalArgumentException exception will be thrown.
	@org.junit.Test (expected = IllegalArgumentException.class)
    public void discountRateLessThanZero(){
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(1), new BigDecimal(-1), discountPeriods, normalPeriods);
    }
	
	//Test 16
	//Check that if the discount rate = 0 or throw exception
	@org.junit.Test 
    public void discountRateEqualToZero(){
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(1), new BigDecimal(0), discountPeriods, normalPeriods);
    }
    
    //Test 17
	//Check the normal rate is greater than discounted rate
	@org.junit.Test
    public void normalRateGreaterThanDiscountRate(){	
       new Rate(CarParkKind.MANAGEMENT, new BigDecimal(2),new BigDecimal(1),discountPeriods,normalPeriods);
    }
    
    //Test 18
	//Check the normal rate is greater than discounted rate. Catch exception if not.
	@org.junit.Test (expected = IllegalArgumentException.class)
    public void normalRateLessThanDiscountRate(){	
       new Rate(CarParkKind.MANAGEMENT, new BigDecimal(2),new BigDecimal(2),discountPeriods,normalPeriods);
    }
	
    //Test 19
	//If normal rate and discount rate have same value, catch exception.
	@org.junit.Test (expected = IllegalArgumentException.class)
    public void normalRateEqualDiscountRate(){	
       new Rate(CarParkKind.MANAGEMENT, new BigDecimal(1),new BigDecimal(1),discountPeriods,normalPeriods);
    }
	
    //Test 20
	//Check discountPeriod holds Max value
	@org.junit.Test
    public void discountPeriodMaxValueCheck(){	
		ArrayList<Period> discountPeriods = new ArrayList<Period>();
		Period discountPeriod = new Period(0,23);
		discountPeriods.add(discountPeriod);
       new Rate(CarParkKind.MANAGEMENT, new BigDecimal(2),new BigDecimal(1),discountPeriods,normalPeriods);
    }

    //Test 21
	//Check discountPeriod sets with empty values
	@org.junit.Test (expected = IllegalArgumentException.class)
    public void discountPeriodEmpty(){	
		ArrayList<Period> discountPeriods = new ArrayList<Period>();
		Period discountPeriod = new Period(i,x);
		discountPeriods.add(discountPeriod);
       new Rate(CarParkKind.MANAGEMENT, new BigDecimal(2),new BigDecimal(1),discountPeriods,normalPeriods);
    }
    
    //Test 22
	//Check discountPeriod boundary (low)
	 @org.junit.Test
    public void discountPeriodBounaryLow(){	
		ArrayList<Period> discountPeriods = new ArrayList<Period>();
		Period discountPeriod = new Period(0,23);
		discountPeriods.add(discountPeriod);
       new Rate(CarParkKind.MANAGEMENT, new BigDecimal(2),new BigDecimal(1),discountPeriods,normalPeriods);
    }
    
    //Test 23
	//Check discountPeriod boundary (high)
    @org.junit.Test 
    public void discountPeriodBounaryHigh(){	
		ArrayList<Period> discountPeriods = new ArrayList<Period>();
		Period discountPeriod = new Period(0,24);
		discountPeriods.add(discountPeriod);
       new Rate(CarParkKind.MANAGEMENT, new BigDecimal(2),new BigDecimal(1),discountPeriods,normalPeriods);
    }
    
    //Test 24
	//Check discountPeriod(s) does not overlap with the normalPeriod(s)
    @org.junit.Test
    public void discountPeriodDoesNotOverlapWithNormalPeriod(){	
		ArrayList<Period> discountPeriods = new ArrayList<Period>();
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		Period discountPeriod1 = new Period(8,9);
		Period discountPeriod2 = new Period(21,23);
		discountPeriods.add(discountPeriod1);
		discountPeriods.add(discountPeriod2);
		Period normalPeriod1 = new Period(9,21);
		normalPeriods.add(normalPeriod1);
       new Rate(CarParkKind.MANAGEMENT, new BigDecimal(2),new BigDecimal(1),discountPeriods,normalPeriods);
    }
    
    //Test 25
	//Check discountPeriod(s) does overlap with the normalPeriod(s)
    @org.junit.Test (expected = IllegalArgumentException.class)
    public void discountPeriodDoesOverlapWithNormalPeriod(){	
		ArrayList<Period> discountPeriods = new ArrayList<Period>();
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		Period discountPeriod1 = new Period(8,9);
		Period discountPeriod2 = new Period(21,00);
		discountPeriods.add(discountPeriod1);
		discountPeriods.add(discountPeriod2);
		Period normalPeriod1 = new Period(21,00);
		normalPeriods.add(normalPeriod1);
       new Rate(CarParkKind.MANAGEMENT, new BigDecimal(2),new BigDecimal(1),discountPeriods,normalPeriods);
    }
    
    //Test 26
	//Check discountPeriod(s) does not overlap with any other discount periods
    @org.junit.Test
    public void discountPeriodNotOverlapWithSlef(){	
		ArrayList<Period> discountPeriods = new ArrayList<Period>();
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		Period discountPeriod1 = new Period(8,9);
		Period discountPeriod2 = new Period(21,23);
		discountPeriods.add(discountPeriod1);
		discountPeriods.add(discountPeriod2);
		Period normalPeriod1 = new Period(9,21);
		normalPeriods.add(normalPeriod1);
       new Rate(CarParkKind.MANAGEMENT, new BigDecimal(2),new BigDecimal(1),discountPeriods,normalPeriods);
    }

    //Test 27
	//Check if discountPeriod(s) overlap with any other discount periods
    @org.junit.Test (expected = IllegalArgumentException.class)
    public void discountPeriodDoesOverlapWithSlef(){	
		ArrayList<Period> discountPeriods = new ArrayList<Period>();
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		Period discountPeriod1 = new Period(8,10);
		Period discountPeriod2 = new Period(9,10);
		discountPeriods.add(discountPeriod1);
		discountPeriods.add(discountPeriod2);
		Period normalPeriod1 = new Period(9,21);
		normalPeriods.add(normalPeriod1);
       new Rate(CarParkKind.MANAGEMENT, new BigDecimal(2),new BigDecimal(1),discountPeriods,normalPeriods);
    }
    
    //Test 28
	//Check if discountPeriod is null catch null pointer
    @org.junit.Test (expected = NullPointerException.class)
    public void discountPeriodisNull(){	
		ArrayList<Period> discountPeriods = new ArrayList<Period>();
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		discountPeriods.add(null);
		Period normalPeriod1 = new Period(9,21);
		normalPeriods.add(normalPeriod1);
       new Rate(CarParkKind.MANAGEMENT, new BigDecimal(2),new BigDecimal(1),discountPeriods,normalPeriods);
    }
    
    //Test 29
 	//Check normalPeriod holds Max value
 	@org.junit.Test
     public void normalPeriodMaxValueCheck(){	
 		ArrayList<Period> normalPeriods = new ArrayList<Period>();
 		Period normalPeriod = new Period(0,23);
 		normalPeriods.add(normalPeriod);
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(2),new BigDecimal(1),discountPeriods,normalPeriods);
     }

    //Test 30
 	//Check normalPeriod sets with empty values
 	@org.junit.Test (expected = IllegalArgumentException.class)
     public void normalPeriodEmpty(){	
 		ArrayList<Period> normalPeriods = new ArrayList<Period>();
 		Period normalPeriod = new Period(i,x);
 		normalPeriods.add(normalPeriod);
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(1),new BigDecimal(1),discountPeriods,normalPeriods);
     }
     
     //Test 31
 	 //Check normalPeriod boundary (low)
 	 @org.junit.Test
     public void normalPeriodBounaryLow(){	
 		ArrayList<Period> discountPeriods = new ArrayList<Period>();
 		Period normalPeriod = new Period(0,23);
 		normalPeriods.add(normalPeriod);
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(2),new BigDecimal(1),discountPeriods,normalPeriods);
     }
     
     //Test 32
 	 //Check normalPeriod boundary (high)
     @org.junit.Test (expected = IllegalArgumentException.class)
     public void normalPeriodBounaryHigh(){	
 		ArrayList<Period> normalPeriods = new ArrayList<Period>();
 		Period normalPeriod = new Period(0,24);
 		normalPeriods.add(normalPeriod);
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(1),new BigDecimal(1),discountPeriods,normalPeriods);
     }
     
     //Test 33
 	 //Check normalPeriod(s) does not overlap with the normalPeriod(s)
     @org.junit.Test
     public void normalPeriodDoesNotOverlapWithNormalPeriod(){	
 		ArrayList<Period> discountPeriods = new ArrayList<Period>();
 		ArrayList<Period> normalPeriods = new ArrayList<Period>();
 		Period normalPeriod1 = new Period(8,9);
 		Period normalPeriod2 = new Period(21,23);
 		normalPeriods.add(normalPeriod1);
 		normalPeriods.add(normalPeriod2);
 		Period discountPeriod1 = new Period(9,21);
 		discountPeriods.add(discountPeriod1);
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(2),new BigDecimal(1),discountPeriods,normalPeriods);
     }
     
     //Test 34
 	 //Check normalPeriod(s) does overlap with the normalPeriod(s)
     @org.junit.Test (expected = IllegalArgumentException.class)
     public void normalPeriodDoesOverlapWithNormalPeriod(){	
 		ArrayList<Period> discountPeriods = new ArrayList<Period>();
 		ArrayList<Period> normalPeriods = new ArrayList<Period>();
 		Period discountPeriod1 = new Period(8,9);
 		Period discountPeriod2 = new Period(21,23);
 		discountPeriods.add(discountPeriod1);
 		discountPeriods.add(discountPeriod2);
 		Period normalPeriod1 = new Period(21,23);
 		normalPeriods.add(normalPeriod1);
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(2),new BigDecimal(1),discountPeriods,normalPeriods);
     }
     
     //Test 35
 	 //Check normalPeriod(s) does not overlap with any other discount periods
     @org.junit.Test
     public void normalPeriodNotOverlapWithSlef(){	
 		ArrayList<Period> discountPeriods = new ArrayList<Period>();
 		ArrayList<Period> normalPeriods = new ArrayList<Period>();
 		Period normalPeriod1 = new Period(8,10);
 		Period normalPeriod2 = new Period(14,15);
 		normalPeriods.add(normalPeriod1);
 		normalPeriods.add(normalPeriod2);
 		Period discountPeriod1 = new Period(16,17);
 		normalPeriods.add(discountPeriod1);
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(2),new BigDecimal(1),discountPeriods,normalPeriods);
     }

     //Test 36
 	 //Check if normalPeriod(s) overlap with any other normal periods
     @org.junit.Test (expected = IllegalArgumentException.class)
     public void normalPeriodDoesOverlapWithSlef(){	
 		ArrayList<Period> discountPeriods = new ArrayList<Period>();
 		ArrayList<Period> normalPeriods = new ArrayList<Period>();
 		Period normalPeriod1 = new Period(8,10);
 		Period normalPeriod2 = new Period(9,10);
 		normalPeriods.add(normalPeriod1);
 		normalPeriods.add(normalPeriod2);
 		Period discountPeriod1 = new Period(9,21);
 		discountPeriods.add(discountPeriod1);
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(2),new BigDecimal(1),discountPeriods,normalPeriods);
     }
     
     //Test 37
 	 //Check if normalPeriod is null catch null pointer
     @org.junit.Test (expected = NullPointerException.class)
     public void normalPeriodisNull(){	
 		ArrayList<Period> discountPeriods = new ArrayList<Period>();
 		ArrayList<Period> normalPeriods = new ArrayList<Period>();
 		normalPeriods.add(null);
 		Period discountPeriod1 = new Period(8,9);
 		discountPeriods.add(discountPeriod1);
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(2),new BigDecimal(1),discountPeriods,normalPeriods);
     }
     
     //Test 38
 	 //Check if both arrays are empty
     @org.junit.Test (expected = IllegalArgumentException.class)
     public void bothPeriodArraysEmpty(){	
 		ArrayList<Period> discountPeriodsEmpty = new ArrayList<Period>();
 		ArrayList<Period> normalPeriodsEmpty = new ArrayList<Period>();
        new Rate(CarParkKind.MANAGEMENT, new BigDecimal(2),new BigDecimal(1),discountPeriodsEmpty,normalPeriodsEmpty);
     }
     
     //Calculate Charge Tests
     
     //Test 1
     //Check discount boundary 8-9
     @org.junit.Test
     public void discountPeriodsCalculateCharge(){
 		ArrayList<Period> discountPeriods = new ArrayList<Period>();
 		ArrayList<Period> normalPeriods = new ArrayList<Period>();
 		
 		Period discountPeriod1 = new Period(8,9);
 		Period discountPeriod2 = new Period(21,23);
 		Period normalPeriod = new Period(9,21);
 		
 		normalPeriods.add(normalPeriod);
 		discountPeriods.add(discountPeriod1);
 		discountPeriods.add(discountPeriod2);
 		
 		Period stayPeriod = new Period(8,9);
 		
         Rate rate = new Rate(CarParkKind.MANAGEMENT, new BigDecimal(5), new BigDecimal(2), discountPeriods,normalPeriods);
         assertEquals(BigDecimal.valueOf(2), rate.calculate(stayPeriod));
     }
     
     //Test 2
     //Check discount boundary 21-00
     @org.junit.Test
     public void discountPeriodsCalculateCharge2(){
 		ArrayList<Period> discountPeriods = new ArrayList<Period>();
 		ArrayList<Period> normalPeriods = new ArrayList<Period>();
 		
 		Period discountPeriod1 = new Period(8,9);
 		Period discountPeriod2 = new Period(21,23);
 		Period normalPeriod = new Period(9,21);
 		
 		normalPeriods.add(normalPeriod);
 		discountPeriods.add(discountPeriod1);
 		discountPeriods.add(discountPeriod2);
 		
 		Period stayPeriod = new Period(21,23);
 		
         Rate rate = new Rate(CarParkKind.MANAGEMENT, new BigDecimal(5), new BigDecimal(2), discountPeriods,normalPeriods);
         assertEquals(BigDecimal.valueOf(4), rate.calculate(stayPeriod));
     }

     //Test 3
     //Check calculation
     @org.junit.Test
     public void calculateChargeCalculation(){
 		ArrayList<Period> discountPeriods = new ArrayList<Period>();
 		ArrayList<Period> normalPeriods = new ArrayList<Period>();
 		
 		Period discountPeriod1 = new Period(8,9);
 		Period discountPeriod2 = new Period(21,23);
 		Period normalPeriod = new Period(9,21);
 		
 		normalPeriods.add(normalPeriod);
 		discountPeriods.add(discountPeriod1);
 		discountPeriods.add(discountPeriod2);
 		
 		Period stayPeriod = new Period(8,9);
 		
         Rate rate = new Rate(CarParkKind.MANAGEMENT, new BigDecimal(5), new BigDecimal(2), discountPeriods,normalPeriods);
         assertEquals(BigDecimal.valueOf(2), rate.calculate(stayPeriod));
     }
     
     //Test 4
     //Check normal boundary 9-21
     @org.junit.Test
     public void checkDiscountBoundry9to21(){
 		ArrayList<Period> discountPeriods = new ArrayList<Period>();
 		ArrayList<Period> normalPeriods = new ArrayList<Period>();
 		
 		Period discountPeriod1 = new Period(8,9);
 		Period discountPeriod2 = new Period(21,23);
 		Period normalPeriod = new Period(9,21);
 		
 		normalPeriods.add(normalPeriod);
 		discountPeriods.add(discountPeriod1);
 		discountPeriods.add(discountPeriod2);
 		
 		Period stayPeriod = new Period(9,21);
 		
         Rate rate = new Rate(CarParkKind.MANAGEMENT, new BigDecimal(5), new BigDecimal(2), discountPeriods,normalPeriods);
         assertEquals(BigDecimal.valueOf(48), rate.calculate(stayPeriod));
     }
   
 	//Test 2.1
 	//Check that if the normal rate is negative, an IllegalArgumentException exception will be thrown.
 	@org.junit.Test (expected = NullPointerException.class)
     public void normalRatePeriodNull(){
         new Rate(CarParkKind.MANAGEMENT, new BigDecimal(6), new BigDecimal(2), discountPeriods, null);
     }
     
}
