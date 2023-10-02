import java.util.Scanner;
public class discount {
    public static void main(String[] args) throws Exception {
        int discount = 10;
        int belanja = 200000;

        if (belanja > 200000){
            discount = 10*belanja/100;
        }

        int totalbayar = belanja - discount;
         System.out.println("totalbayar :" +totalbayar);

    }     
           
        
     


}



   


 
