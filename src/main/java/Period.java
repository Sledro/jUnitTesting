/**
 * Created by Daniel Hayden on 08/02/2018.
 * Student Number: C00137009
 * Email: dan@sledro.com
 */

public class Period {

	int start;
	int end;
	
	Period(){
		setStart(0);
		setEnd(0);
	}
	
	Period(int start, int end){
		setStart(start);
		setEnd(end);
	}
	
	public int duration(){
		return 5;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}
		
}
