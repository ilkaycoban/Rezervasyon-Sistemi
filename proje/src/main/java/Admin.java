
public class Admin extends User{

    private  int hizmetbedeli;
    
    public Admin(String kullaniciadi, String sifre,int hizmetbedeli) {
        super(kullaniciadi, sifre);
        this.hizmetbedeli=hizmetbedeli;
    }

    public int getHizmetbedeli() {
        return hizmetbedeli;
    }

    public void setHizmetbedeli(int hizmetbedeli) {
        this.hizmetbedeli = hizmetbedeli;
    }

    @Override
    public String kullanici() {
        return getKullaniciadi();
    }

    @Override
    public String sifre() {
        return getSifre();
    }
}
