import java.util.Scanner;

public class nilai {
   public static void main(String[] args) throws Exception {
Double nilai;
    String indeksiNilai;

    Scanner inputan = new Scanner(System.in);
    System.out.print("masukan nilai: ");
    nilai = inputan.nextDouble();

    if (nilai >= 75) {
        indeksiNilai = "A";
    } else if (nilai >= 65) {
        indeksiNilai = "B";
    } else if (nilai >= 55) {
        indeksiNilai = "C";
    } else {
        indeksiNilai = "E";
    }

       System.out.println("Indeks nilai: "  + indeksiNilai);



}


   }
    
    
