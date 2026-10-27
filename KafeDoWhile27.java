import java.util.Scanner;

public class KafeDoWhile27 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int kopi, teh, roti;
    String namaPelanggan;
    int hargaKopi =12000, hargaTeh =7000, hargaRoti =20000;
    double totalHarga;
    do{
        System.out.println("masukkan nama pelanggan (ketik 'batal' untuk keluar) :");
        namaPelanggan= sc.nextLine();
        if (namaPelanggan.equalsIgnoreCase("batal")) {
            System.out.println("transaksi dibatalkan");
            break;
        }
        System.out.println("jumlah kopi:");
        kopi =sc.nextInt();
        System.out.println("jumlah teh:");
        teh =sc.nextInt();
        System.out.println("jumlah roti:");
        roti =sc.nextInt();
        totalHarga = (kopi* hargaKopi)+ (teh *hargaTeh)+(roti*hargaRoti);
        System.out.println("total yang harus dibayar : rp " + totalHarga);
        sc.nextLine();
    } while (true);
        System.out.println("semua transaksi selesai");

    }
}
