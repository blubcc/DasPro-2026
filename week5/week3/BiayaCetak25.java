import java.util.Scanner;
public class BiayaCetak25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        int biayaPerLembar = 500;
        int biayaJilid = 5000;
        int totalBiaya;

        System.out.print("Masukkan jumlah lembar dokumen (x): ");
        x = sc.nextInt();

        totalBiaya = (x * biayaPerLembar) + biayaJilid;

        System.out.println("Total biaya yang harus dibayar: Rp " + totalBiaya);

        sc.close();
    }
}