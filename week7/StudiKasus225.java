import java.util.Scanner;

public class StudiKasus225 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaMahasiswa, jenisKegiatan;
        int jumlahDokumen, peringkatJuara, statusPendanaanPKM;

        System.out.print("Nama mahasiswa : ");
        namaMahasiswa = input.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = input.nextLine();
        System.out.print("Jumlah dokumen yang diupload : ");
        jumlahDokumen = input.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            
            System.out.print("Peringkat juara : ");
            peringkatJuara = input.nextInt();

            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Dana penghargaan diberikan.");
                } else {
                    int kurangDokumen = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurangDokumen + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Status pendanaan PKM (1 jika lolos, 0 jika tidak) : ");
            statusPendanaanPKM = input.nextInt();

            if (statusPendanaanPKM == 1) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Dana penghargaan diberikan.");
                } else {
                    int kurangDokumen = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurangDokumen + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak lolos pendanaan PKM. Dana penghargaan tidak diberikan.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("LAINNYA")) {
            System.out.println("Status : Kegiatan di luar ketentuan. Dana penghargaan tidak diberikan.");
        } else {
            System.out.println("Status : Jenis kegiatan tidak valid.");
        }

        input.close();
    }
}