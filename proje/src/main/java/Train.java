public class Train extends Vehicle{
    
    public Train(String yakitTuru, int yakit, String id, int kapasite) {
        super(yakitTuru, yakit, id, kapasite);
    }
    
    public int CalculateFuelCost(int km, int yakit) {
        int cost = km*yakit;
        return cost;
    }   
}