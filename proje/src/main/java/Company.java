
public class Company extends User implements  IProfitable{
    
    Train train = new Train("elektrik",3 , "T1",25 );
    Bus abus1 = new Bus("benzin", 10, "A1", 20);
    Bus abus2 = new Bus("benzin", 10, "A2", 20);
    Bus bbus1 = new Bus("motorin", 5, "B1", 15);
    Bus bbus2 = new Bus("motorin", 5, "B2", 20);
    Bus cbus1 = new Bus("motorin", 6, "C1", 20);
    Airplane cairplane1 = new Airplane("gaz", 25, "C2", 30);
    Airplane cairplane2 = new Airplane("gaz", 25, "C3", 30);
    Airplane fairplane1 = new Airplane("gaz", 20, "F1", 30);
    Airplane fairplane2 = new Airplane("gaz", 20, "F2", 30);
    
    Route rota1 = new Route("istanbul", "ankara", 500);
    Route rota2 = new Route("istanbul", "konya", 600);
    Route rota3 = new Route("istanbul", "ankara", 500);
    Route rota4 = new Route("istanbul", "konya", 600);
    Route rota5 = new Route("istanbul", "konya", 600);
    Route rota6 = new Route("istanbul", "ankara", 500);
    
    Personel apersonel = new Personel(5000, "ahmet", "sayar");
    Personel apersone2 = new Personel(5000, "mehmet", "1");
    Personel apersone3 = new Personel(2000, "ali", "1");
    Personel apersone4 = new Personel(2000, "veli", "1");
    Personel apersone5 = new Personel(5000, "şeref", "çoban");
    Personel apersone6 = new Personel(5000, "eren", "aytemür");
    Personel apersone7 = new Personel(2000, "ziya", "kemal yaşar Beyaltlı");
    Personel apersone8 = new Personel(2000, "muhammet", "Ağırmen");
        
    Personel bpersonel = new Personel(3000, "yunus", "şahin");
    Personel bpersone2 = new Personel(3000, "ENSAR", "ÇEPNİ");
    Personel bpersone3 = new Personel(1500, "ismail", "9numara");
    Personel bpersone4 = new Personel(1500, "emre", "aydin");
    Personel bpersone5 = new Personel(3000, "hasan", "takvaş");
    Personel bpersone6 = new Personel(3000, "aykan", "ipek");
    Personel bpersone7 = new Personel(1500, "şevki", "dayim");
    Personel bpersone8 = new Personel(1500, "ramazan", "ronaldo");
        
    Personel cpersonel = new Personel(4000, "ÇOBAN", "İLKAY");
    Personel cpersone2 = new Personel(4000, "protocol", "ömer");
    Personel cpersone3 = new Personel(2000, "fatih", "bal");
    Personel cpersone4 = new Personel(2000, "ilker", "çoban");
    Personel cpersone5 = new Personel(10000, "ediz", "efe");
    Personel cpersone6 = new Personel(10000, "efe", "ersoy");
    Personel cpersone7 = new Personel(6000, "tuna ", "şen");
    Personel cpersone8 = new Personel(6000, "osman", "gültekin ");
    Personel cpersone9 = new Personel(10000, "salih", "ucan");
    Personel cpersone10 = new Personel(10000, "lionel", "messi");
    Personel cpersone11 = new Personel(6000, "cristiano", "ronaldo");
    Personel cpersone12 = new Personel(6000, "boz", "murat");
    
    Personel dpersonel = new Personel(2000, "enes", "KARAhan");
    Personel dpersone2 = new Personel(2000, "Burak", "atakli");
    Personel dpersone3 = new Personel(1000, "eren", "CAN");
    Personel dpersone4 = new Personel(1000, "Can", "yaman");
    Personel dpersone5 = new Personel(2000, "gökdeniz", "devlet");
    Personel dpersone6 = new Personel(2000, "AKbal", "gök");
    Personel dpersone7 = new Personel(1000, "yunus", "BAykara");
    Personel dpersone8 = new Personel(1000, "mehmet", "bicakci");
    Personel dpersone9 = new Personel(2000, "ali", "bicakci");
    Personel dpersone10 = new Personel(2000, "sinem", "yılmaz");
    Personel dpersone11 = new Personel(1000, "burak", "yıldız");
    Personel dpersone12 = new Personel(1000, "arda", "yıldırım");
    
    Personel fpersonel = new Personel(7500, "merhaba", "katık");
    Personel fpersone2 = new Personel(7500, "selma", "aydın");
    Personel fpersone3 = new Personel(4000, "furkan", "cetin");
    Personel fpersone4 = new Personel(4000, "cerin", "koç");
    Personel fpersone5 = new Personel(7500, "olgun", "yılmaz");
    Personel fpersone6 = new Personel(7500, "hanife", "karahan");
    Personel fpersone7 = new Personel(4000, "osman", "şen");
    Personel fpersone8 = new Personel(4000, "ilkay", "çoban");
    
    Admin admin = new Admin("admin", "123", 1000);
    
    
    
    public Company(String kullaniciadi, String sifre) {
        super(kullaniciadi, sifre);
    }

    @Override
    public String kullanici() {
    return getKullaniciadi();
    }

    @Override
    public String sifre() {
    return getSifre();
    }
    
    
    public int giderhesapla(int sirket)
    {                                              //a,b= günlük yakıt gideri
                                                   //c= günlük toplam personel gideri
        int gider=0;
        
        
        if(sirket==1) //A sirketi
        {
            int a,b,c;
           a=2*abus1.CalculateFuelCost(rota3.getKm(), abus1.getYakit());
           b=2*(abus2.CalculateFuelCost(rota3.getKm(), abus2.getYakit()));
           c=apersonel.getMaas()+apersone2.getMaas()+apersone3.getMaas()+apersone4.getMaas()+apersone5.getMaas()+apersone6.getMaas();
           c=c+apersone7.getMaas()+apersone8.getMaas();
           c=c*2;
           gider=a+b+c+admin.getHizmetbedeli();
           return gider;
            
        }
        else if (sirket==2) {//B sirketi
           int a,b,c;
           a=2*bbus1.CalculateFuelCost(rota3.getKm(), bbus1.getYakit());
           b=2*(bbus2.CalculateFuelCost(rota4.getKm(), bbus2.getYakit()));
          
           c=bpersonel.getMaas()+bpersone2.getMaas()+bpersone3.getMaas()+bpersone4.getMaas()+bpersone5.getMaas()+bpersone6.getMaas();
           c=c+bpersone7.getMaas()+bpersone8.getMaas();
           c=c*2;
           
           gider=a+b+c+admin.getHizmetbedeli();
           return gider;
            
        }
        else if (sirket==3) {//C sirketi
           int a,b,c,d;
           a=2*cbus1.CalculateFuelCost(rota4.getKm(), cbus1.getYakit());
           b=2*(cairplane1.CalculateFuelCost(rota5.getKm(), cairplane1.getYakit()));
           d=2*(cairplane2.CalculateFuelCost(rota5.getKm(), cairplane2.getYakit()));
           c=cpersonel.getMaas()+cpersone2.getMaas()+cpersone3.getMaas()+cpersone4.getMaas()+cpersone5.getMaas()+cpersone6.getMaas();
           c=c+cpersone7.getMaas()+cpersone8.getMaas()+cpersone9.getMaas()+cpersone10.getMaas()+cpersone11.getMaas()+cpersone12.getMaas();
           c=c*2;
           gider=a+b+c+d+admin.getHizmetbedeli();
           return gider;
            
        }
        else if (sirket==4) {//D sirketi
           int a,b,c,d;
           a=2*train.CalculateFuelCost(rota1.getKm(), train.getYakit());
           b=2*train.CalculateFuelCost(rota2.getKm(), train.getYakit());
           d=2*train.CalculateFuelCost(rota2.getKm(), train.getYakit());
            c=dpersonel.getMaas()+dpersone2.getMaas()+dpersone3.getMaas()+dpersone4.getMaas()+dpersone5.getMaas()+dpersone6.getMaas();
           c=c+dpersone7.getMaas()+dpersone8.getMaas()+dpersone9.getMaas()+dpersone10.getMaas()+dpersone11.getMaas()+dpersone12.getMaas();
           c=c*2;
           gider=a+b+c+d+admin.getHizmetbedeli();
           return gider;
            
        }
        else if (sirket==5) {//F sirketi
           int a,b,c,d;
           a=2*fairplane1.CalculateFuelCost(rota6.getKm(), fairplane1.getYakit());
           b=2*fairplane2.CalculateFuelCost(rota6.getKm(), fairplane2.getYakit());
          
           c=fpersonel.getMaas()+fpersone2.getMaas()+fpersone3.getMaas()+fpersone4.getMaas()+fpersone5.getMaas()+fpersone6.getMaas();
           c=c+fpersone7.getMaas()+fpersone8.getMaas();
           c=c*2;
           gider=a+b+c+admin.getHizmetbedeli();
           return gider;
            
        }
        return 0;
            
    }


    

    
    
}
