import java.util.Scanner;
public class StudiKasus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Gaji Pokok: ");
        double gajiPokok = scanner.nextDouble();

        System.out.print("Masukkan Tunjangan Anak per Bulan: ");
        double tunjanganPerAnak = scanner.nextDouble();

        System.out.print("Masukkan Jumlah Anak: ");
        int jumlahAnak = scanner.nextInt();

        double totalTunjanganAnak = jumlahAnak * tunjanganPerAnak;
        double potongPensiun = gajiPokok * 0.10;
        double gajiBersih = gajiPokok + totalTunjanganAnak - potongPensiun;

        System.out.println("\nHasil Perhitungan Gaji");
        System.out.println("Gaji Pokok         : Rp " + gajiPokok);
        System.out.println("Total Tunjangan    : Rp " + totalTunjanganAnak);
        System.out.println("Potongan Pensiun   : Rp " + potongPensiun);
        System.out.println("------------------------------------");
        System.out.println("Gaji Bersih Diterima: Rp " + gajiBersih);

        scanner.close();
    }
}