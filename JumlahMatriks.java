import java.util.Scanner;

public class JumlahMatriks {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Masukkan jumlah baris ");
       int baris = input.nextInt();
       System.out.println("Masukkan jumlah kolom ");
         int kolom = input.nextInt();

         int[][] matriks = new int[baris][kolom];

         for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Nilai matriks[ " + i +"[]" + j + " ] = ");
                matriks[i][j] = input.nextInt();
            }
         }
         System.out.println("Matriks yang diinputkan adalah : ");
         for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
         }
    }


}
