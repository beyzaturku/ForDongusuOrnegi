package fordongusuornegi2;
import java.util.*;
public class ForDongusuOrnegi2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        int toplam=0;
        boolean a =true;
        
        while(a){
            System.out.print("Bir sayı giriniz:");
            sayi = input.nextInt();
            if(sayi%2==1){
                a = false;
            }
            else{
                if((sayi%2==0) && (sayi%4==0)){
                    toplam += sayi;
                }
            }
                    
        }
        System.out.print("Sonuç:" + toplam );
      
   
        
    }
    
}
