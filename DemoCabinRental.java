
public class DemoCabinRental {
    
    public static void main(String [] args)
    {
       CabinRental LowCabin = new CabinRental(2);
       CabinRental HighCabin = new CabinRental(11);
       HolidayCabinRental LowHoliday = new HolidayCabinRental(1);
       HolidayCabinRental HighHoliday = new HolidayCabinRental(5);
       
       System.out.println("Low Cabin "+LowCabin);
       System.out.println("Low Holiday "+LowHoliday);
       System.out.println("High Cabin "+HighCabin);
       System.out.println("High Holiday "+HighHoliday);
      
        
    }
}