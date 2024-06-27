
public class Bus extends Vehicle{

    public Bus(String yakitTuru, int yakit, String id, int kapasite) {
        super(yakitTuru, yakit, id, kapasite);
    }


    @Override
    public int CalculateFuelCost(int km, int yakit) {
    
         int cost = km*yakit;
        return cost;
        
    }
    
    
  
}
