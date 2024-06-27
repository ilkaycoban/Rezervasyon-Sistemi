import java.util.ArrayList;

public class Proje {

    public static void main(String[] args) {
       
        Company companyA = new Company("A", "123a");
        Company companyB = new Company("B", "123b");
        Company companyC = new Company("C", "123c");
        Company companyD = new Company("D", "123d");
        Company companyF = new Company("F", "123f");        
      
        ArrayList<Customer> customers = new ArrayList<Customer>();
       
     //   customers.add(new Customer("ilker","coban","1","21546000"));   
     //   customers.get(1).customerBilgisi();
        


      Ana_menu x = new Ana_menu();
       x.setVisible(true);
        
        
       
     
    }
}
