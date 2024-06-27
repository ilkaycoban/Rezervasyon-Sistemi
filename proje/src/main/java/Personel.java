public class Personel extends Person{
    
   
    private int  maas;

    public Personel(int maas, String ad, String soyad) {
        super(ad, soyad);
        this.maas = maas;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }
    

    
}