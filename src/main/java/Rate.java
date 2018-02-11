/**
 * Created by Daniel Hayden on 08/02/2018.
 * Student Number: C00137009
 * Email: dan@sledro.com
 */

import java.math.BigDecimal;
import java.util.ArrayList;

public class Rate {

	public Rate(CarParkKind kind, BigDecimal normalRate, BigDecimal discountedRate, ArrayList<Period> discountPeriods, ArrayList<Period> normalPeriods) {
		//Check is positive of throw exception
		//https://stackoverflow.com/questions/4164521/compare-if-bigdecimal-is-greater-than-zero
		if (normalRate.compareTo(BigDecimal.ZERO) < 1) {
            throw new IllegalArgumentException();
        }
	}
}
