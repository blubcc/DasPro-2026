import java.util.Scanner;

public class UGDHarapanKita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai Spo2: ");
        int spo2 = sc.nextInt();

        System.out.print("Masukkan sisa tempat tidur ICU: ");
        int sisaBedIcu = sc.nextInt();

        System.out.print("Masukkan tekanan darah sistolik: ");
        int sistolik = sc.nextInt();

        System.out.print("Apakah pasien sadar penuh? (true/false): ");
        boolean sadarPenuh = sc.nextBoolean();

        System.out.print("Masukkan suhu tubuh: ");
        double suhuTubuh = sc.nextDouble();

        System.out.print("Apakah pasien memiliki komorbid? (true/false): ");
        boolean komorbid = sc.nextBoolean();

        System.out.print("Masukkan usia pasien: ");
        int usia = sc.nextInt();

        System.out.print("Masukkan laju napas: ");
        int lajuNapas = sc.nextInt();

        String ruangan = "";

        if (spo2 < 85 && sisaBedIcu > 0) {
            ruangan = "ICU";
        } else if (spo2 < 85 && sisaBedIcu == 0) {
            ruangan = "UGD_VENTILATOR_MOBIL";
        } else if ((spo2 >= 85 && spo2 <= 89) || (sistolik < 90 || sistolik > 180) || (!sadarPenuh)) {
            ruangan = "RESUSITASI_UGD";
        } else if (((spo2 >= 90 && spo2 <= 94) || suhuTubuh > 39) && komorbid && usia >= 65) {
            ruangan = "HCU_ISOLASI";
        } else if ((spo2 >= 90 && spo2 <= 94) || lajuNapas > 24) {
            ruangan = "RAWAT_INAP_UMUM";
        } else {
            ruangan = "RAWAT_JALAN";
        }

        System.out.println("Lokasi Perawatan Pasien: " + ruangan);
        sc.close();
    }
}