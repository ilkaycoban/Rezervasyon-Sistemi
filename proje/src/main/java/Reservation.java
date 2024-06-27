public class Reservation {
    private String yolcu;
    private Vehicle arac;
    private Transport koltuk= new Transport();

    public String getYolcu() {
        return yolcu;
    }

    public void setYolcu(String yolcu) {
        this.yolcu = yolcu;
    }

    public Vehicle getArac() {
        return arac;
    }

    public void setArac(Vehicle arac) {
        this.arac = arac;
    }

    public Transport getKoltuk() {
        return koltuk;
    }

    public void setKoltuk(Transport koltuk) {
        this.koltuk = koltuk;
    }

    public Reservation(String yolcu, Vehicle arac, Transport koltuk) {
        this.yolcu = yolcu;
        this.arac = arac;
        this.koltuk = koltuk;
    }
}
