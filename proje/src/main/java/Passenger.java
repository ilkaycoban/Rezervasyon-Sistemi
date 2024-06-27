public class Passenger extends Person{
    
    public Passenger(String ad, String soyad) {
        super(ad, soyad);
    }
    private String tc;
    private int yas;

    public Passenger(String tc, int yas, String ad, String soyad) {
        super(ad, soyad);
        this.tc = tc;
        this.yas = yas;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
   
}