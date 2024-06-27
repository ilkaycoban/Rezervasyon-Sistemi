
public class Trip {
  
    private Vehicle arac;
    
    private Route guzergah;
    private int  zaman;
    private int fiyat;

    public Trip(Vehicle arac, Route guzergah, int  zaman, int fiyat) {
        this.arac = arac;
        this.guzergah = guzergah;
        this.zaman = zaman;
        this.fiyat = fiyat;
    }

    public Vehicle getArac() {
        return arac;
    }

    public void setArac(Vehicle arac) {
        this.arac = arac;
    }

    public Route getGuzergah() {
        return guzergah;
    }

    public void setGuzergah(Route guzergah) {
        this.guzergah = guzergah;
    }

    public int getZaman() {
        return zaman;
    }

    public void setZaman(int zaman) {
        this.zaman = zaman;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

   
}
