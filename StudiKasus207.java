import java.util.Scanner;

public class StudiKasus207 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = input.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = input.next();
        
        System.out.print("Jumlah dokumen : ");
        int jmlDokumen = input.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            
            System.out.print("Peringkat juara : ");
            int peringkat = input.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                if (jmlDokumen == 4) {
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan.");
                } else {
                    int kurangDokumen = 4 - jmlDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurangDokumen + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Status pendanaan PKM (1 = didanai, 0 = tidak) : ");
            int statusPkm = input.nextInt();

            if (statusPkm == 1) {
                if (jmlDokumen == 4) {
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan.");
                } else {
                    int kurangDokumen = 4 - jmlDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurangDokumen + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : PKM tidak didanai. Dana penghargaan tidak diberikan.");
            }

        } else {
            System.out.println("Status : Kegiatan di luar ketentuan. Dana penghargaan tidak diberikan.");
        }
    }
}