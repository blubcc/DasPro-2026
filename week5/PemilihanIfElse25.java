import java.util.Scanner;

public class PemilihanIfElse25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- CETAK KRS SIAKAD ---");
        System.out.print("Masukkan semester saat ini: ");
        int semester = sc.nextInt();

        if (semester == 1) {
            System.out.println("KRS semester 1 ditampilkan");
        } else if (semester == 2) {
            System.out.println("KRS semester 2 ditampilkan");
        } else if (semester == 3) {
            System.out.println("KRS semester 3 ditampilkan");
        } else if (semester == 4) {
            System.out.println("KRS semester 4 ditampilkan");
        } else if (semester == 5) {
            System.out.println("KRS semester 5 ditampilkan");
        } else if (semester == 6) {
            System.out.println("KRS semester 6 ditampilkan");
        } else if (semester == 7) {
            System.out.println("KRS semester 7 ditampilkan");
        } else if (semester == 8) {
            System.out.println("KRS semester 8 ditampilkan");
        } else {
            System.out.println("Semester tidak valid");
        }
        sc.close();
    }
}