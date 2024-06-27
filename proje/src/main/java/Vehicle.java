
public abstract class Vehicle {
    
    private  String yakitTuru;
    private int yakit;
    private String id;
    private int kapasite;

    public Vehicle(String yakitTuru, int yakit, String id, int kapasite) {
        this.yakitTuru = yakitTuru;
        this.yakit = yakit;
        this.id = id;
        this.kapasite = kapasite;
    }

    public String getYakitTuru() {
        return yakitTuru;
    }

    public void setYakitTuru(String yakitTuru) {
        this.yakitTuru = yakitTuru;
    }

    public int getYakit() {
        return yakit;
    }

    public void setYakit(int yakit) {
        this.yakit = yakit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }

    
    
    
    
    
   public abstract  int CalculateFuelCost(int km,int yakit) ;
    
    
}
