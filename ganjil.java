import java.util.Scanner;

public class ganjil {
    public static void main(String[] args)throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("masukan angka: ");
        int angka = inputan.nextInt();

        if (angka % 2 == 0) {
            System.out.println("bilangan genap");
    }   else {
        System.out.println("bilangan ganjil");
    }
}
}

    
    

