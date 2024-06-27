public class Route {
    
    private String kalkis;
    private  String varis;
    private int km;
   
    public Route(String kalkis, String varis,int km) {
        this.kalkis = kalkis;
        this.varis = varis;
       this.km= km;
    }  

    public String getKalkis() {
        return kalkis;
    }

    public void setKalkis(String kalkis) {
        this.kalkis = kalkis;
    }

    public String getVaris() {
        return varis;
    }

    public void setVaris(String varis) {
        this.varis = varis;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
    
}
