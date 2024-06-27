
public class Airplane extends Vehicle{

    
    
    public Airplane(String yakitTuru, int yakit, String id, int kapasite) {
        super(yakitTuru, yakit, id, kapasite);
    }

    
    @Override
    public int CalculateFuelCost(int km, int yakit) {
        int cost = yakit*km;
        return cost; 
    }

}