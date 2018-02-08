import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.junit.Test;

public class HaydenDanielTestTask1 {

	//Test rate contains valid arguments
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void nullValuesInputted() throws Exception {
    	
    		BigDecimal normalRate = new BigDecimal("2.00");
    		BigDecimal discountedRate = new BigDecimal("4.00");
    		ArrayList<Period> discountPeriods = new ArrayList<Period>();
    		ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Rate std = new Rate(CarParkKind.STAFF, normalRate, discountedRate, discountPeriods, normalPeriods);
    }
    
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void normalRateIsPositive() throws Exception {
    		Rate std = new Rate();
        std.getAttendanceGrade(-42);
    }

}
