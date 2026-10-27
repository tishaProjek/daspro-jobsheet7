
import java.util.Scanner;

public class tugas127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket;
        int totalTiket = 0;
        double totalHarga, diskon, hargaBayar;
        double totalPenjualan = 0;

        while (true) {
            System.out.println("Masukkan jumlah tiket (0 untuk selesai):");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid!");
                System.out.println("Silakan masukkan ulang.");
                continue;
            }

            totalHarga = jumlahTiket * hargaTiket;
            diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15 * totalHarga;
            } else if (jumlahTiket > 4) {
                diskon = 0.10 * totalHarga;
            }

            hargaBayar = totalHarga - diskon;

            totalTiket = totalTiket + jumlahTiket;
            totalPenjualan = totalPenjualan + hargaBayar;

            System.out.println("Jumlah tiket: " + jumlahTiket);
            System.out.println("Harga sebelum diskon: Rp " + totalHarga);
            System.out.println("Diskon: Rp " + diskon);
            System.out.println("Total pembayaran: Rp " + hargaBayar);
        }

        System.out.println("LAPORAN PENJUALAN HARIAN");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);

        sc.close();
    }
}
