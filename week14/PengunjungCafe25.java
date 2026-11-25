package week14;
public class PengunjungCafe25 {
    static int hitungTotalBelanja(int... harga) {
        int total = 0;

        for (int nilai : harga) {
            total += nilai;
        }

        return total;
    }
    public static void main(String[] args) {
        System.out.println("Total 1 argumen: Rp " + hitungTotalBelanja(15000));
        System.out.println("Total 3 argumen: Rp " + hitungTotalBelanja(15000, 20000, 10000));
        System.out.println("Total 5 argumen: Rp " + hitungTotalBelanja(15000, 20000, 10000, 12000, 18000));
    }
}