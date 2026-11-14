package week12;

public class SearchNilai25 {
    public static void main(String[] args) {
        int[] nilai = {78, 65, 90, 55, 88, 72};
        int key = 100; // Coba ganti dengan angka yang tidak ada, misal 100
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Nilai " + key + " tidak ditemukan di dalam array.");
        }
    }
}