
import java.util.Random;


public class Transport implements IReservable{

    public int[][][][] arac = new int[7][12][6][20];
     public void duzelt(){
          int i,j;
          for( i=0;i<7;i++)
          {
              for(j=0;j<6;j++)
              {
                arac[i][0][j]= new int[20]; //Abus1
                arac[i][1][j]= new int[15]; //Abus2
                arac[i][2][j]= new int[15]; //Bbus1
                arac[i][3][j]= new int[20]; //Bbus2
                arac[i][4][j]= new int[20]; //Cbus1
                arac[i][5][j]= new int[30]; //Cairplane1
                arac[i][6][j]= new int[30]; //Cairplane2
                arac[i][7][j]= new int[25]; //Dtrain1
                arac[i][8][j]= new int[25]; //Dtrain2
                arac[i][9][j]= new int[25]; //Dtrain3
                arac[i][10][j]= new int[30]; //Fairplane1
                arac[i][11][j]= new int[30]; //Fairplane2   
              }          
          }         
    }
   
     public void rastgeleDoldur(){
         int i,j,k,a,b;
          Random random= new Random();
         int random1;
         for(i=0;i<7;i++)
         {
             for(j=0;j<12;j++)
             {
                 for(k=0;k<6;k++)
                 {
                     for(a=0;a<arac[i][j][k].length;a++)
                     {
                        random1 = random.nextInt(2);
                        arac[i][j][k][a]=random1;                           
                     }
                 }
             }
         }
         
        for( i=0;i<6;i++)              // pazartesi gününe ait bbus1 ful dolmuştur
        {
            for( j=0;j<15;j++)
            {
                arac[0][2][i][j]=1;
            }
        }
        
        for( i=0;i<6;i++)              // pazartesi gününe ait abus1 ful dolmuştur
        {
            for( j=0;j<20;j++)
            {
                arac[0][0][i][j]=1;
            }
        }

        for( i=0;i<6;i++)              // salı gününe ait cbus1 2 boş kaldı
        {
            for( j=0;j<20;j++)
            {
                arac[1][4][i][j]=1;
            }
        }
        for(i=0;i<6;i++)
        {
        arac[1][4][i][10]=0;
        arac[1][4][i][14]=0;
        }
     }

    public void doldur(int gun , int aracno,int binicek,int inicek,int koltuk)
    {
        for(int b=binicek;b<inicek-1;b++)
        {
            arac[gun][aracno][b][koltuk]=1; 
        }    
    }
    
    public int ilkinidoldur(int gun , int aracno,int binicek,int inicek)
    {
        for(int i=0;i<arac[gun][aracno][binicek].length;i++)
        {
            if(arac[gun][aracno][binicek][i]==0 )
            {
                for(int b=binicek;b<inicek-1;b++)
                {  
                   arac[gun][aracno][b][i]=1; 
                }  
                return i;    
            }
            
        }
        return -1;
        
    }

   
    public boolean bosMu(int gun , int aracno,int binicek,int koltuk){

    if(arac[gun][aracno][binicek][koltuk]==0)
     {
        return true;
     }
    else
    {
        return false;
    }
       

    }

      public int boskoltuklar(int gun , int aracno,int binicek){
        int kapasite = arac[gun][aracno][binicek].length;
        int a=0;
        for(int i=0;i<kapasite;i++)
        {
            if(bosMu(gun, aracno, binicek,i))
            {
                a++;
            }     
        } 
        return a;
     }
      
     

    
    
public int gelirhesapla(int gun,int sirket){
    
    int sayac=0;
    
    if(sirket==1)// A sirketi
    {
        for(int k=0;k<2;k++)
        {
            for(int i=0;i<6;i++)
             {
                for(int j=0;j<arac[gun][k][i].length;j++)
                  {
                      if(!(bosMu(gun,k,i,j)))
                      {
                          sayac++;
                      }
                  }
              } 
        }
    return sayac*300*2;
    }
    else if(sirket==2) // B sirketi
    {
         for(int k=2;k<4;k++)
        {
            for(int i=0;i<6;i++)
             {
                for(int j=0;j<arac[gun][k][i].length;j++)
                  {
                      if(!(bosMu(gun,k,i,j)))
                      {
                          sayac++;
                      }
                  }
              } 
        }
        return sayac*200*2;
        
    }
    else if (sirket==3)// C sirketi
    {
        int sayac1=0;
        
         for(int k=4;k<5;k++)
        {
            for(int i=0;i<6;i++)
             {
                for(int j=0;j<arac[gun][k][i].length;j++)
                  {
                      if(!(bosMu(gun,k,i,j)))
                      {
                          sayac++;
                      }
                  }
              } 
        }
         
         for(int k=5;k<7;k++)
        {
            for(int i=0;i<6;i++)
             {
                for(int j=0;j<arac[gun][k][i].length;j++)
                  {
                      if(!(bosMu(gun,k,i,j)))
                      {
                          sayac1++;
                      }
                  }
              } 
        }
       
         return 2*(sayac*200+sayac1*1200);
        
    }
    else if(sirket==4) // D sirketi
    {
         for(int k=7;k<10;k++)
        {
            for(int i=0;i<6;i++)
             {
                for(int j=0;j<arac[gun][k][i].length;j++)
                  {
                      if(!(bosMu(gun,k,i,j)))
                      {
                          sayac++;
                      }
                  }
              } 
        }
        return sayac*200*2;
        
        
    }
     else if(sirket==5) // F sirketi
    {
         for(int k=10;k<12;k++)
        {
            for(int i=0;i<6;i++)
             {
                for(int j=0;j<arac[gun][k][i].length;j++)
                  {
                      if(!(bosMu(gun,k,i,j)))
                      {
                          sayac++;
                      }
                  }
              } 
        }
        return sayac*1200*2;
 
    }
    return 0;
}
    
    
    
}
      