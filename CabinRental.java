
public class CabinRental {
protected int myCabinNum;
protected double Rate;

	public CabinRental(int CabinNum){
		myCabinNum = CabinNum;
		
		if(myCabinNum <= 3)
		{
			Rate = 950;
		}
		else{
			Rate = 1100;
		}
		
	}
	
	public String toString(){
		return "# "+myCabinNum+" rate: "+Rate;
	}

}
