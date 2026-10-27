
import java.util.Scanner;

public class tugas227 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        while (true) {
            System.out.println("Masukkan jenis kendaraan:");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                break;
            }

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            } else {
                System.out.println("Jenis kendaraan tidak valid!");
            }
        }

        System.out.println("Total pembayaran parkir: Rp " + total);

        sc.close();
    }
}
