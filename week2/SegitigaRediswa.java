import java.util.Scanner;
public class SegitigaRediswa {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int alas, tinggi;
        float luas;

        System.out.print("Masukkan alas: ");
        alas = sc.nextInt();
        System.out.print("Masukkan tinggi: ");
        tinggi =  sc.nextInt();

        luas = alas * tinggi / 2;
        //supaya tidak bulat bisa 2.0f

        System.out.println("Luas segitiga: " + luas);
    }
}