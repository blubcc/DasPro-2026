import java.util.Scanner;

public class TugasParkir25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan durasi parkir (jam): ");
        int durasi = sc.nextInt();

        if (durasi > 5) {
            System.out.println("Dikenakan tarif denda");
        } else {
            System.out.println("Tarif parkir normal");
        }

        sc.close();
    }
}