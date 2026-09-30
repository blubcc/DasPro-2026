import java.util.Scanner;

public class TugasAntrean25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kode layanan (1-4): ");
        int kode = sc.nextInt();

        switch (kode) {
            case 1:
                System.out.println("Layanan 1 dipilih");
                break;
            case 2:
                System.out.println("Layanan 2 dipilih");
                break;
            case 3:
                System.out.println("Layanan 3 dipilih");
                break;
            case 4:
                System.out.println("Layanan 4 dipilih");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
        }
        sc.close();
    }
}