import java.util.Scanner;

public class SiakadFor27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, nilaiTertinggi = 0, nilaiTerendah = 100;
        int jumlLulus = 0, jumlTidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("masukkan nilai mahasiswa ke-" + i + ":");
            nilai = sc.nextDouble();
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
            if (nilai >= 60) {
                jumlLulus++;
            } else {
                jumlTidakLulus++;
            }
        }
        System.out.println("nilai tertinggi :" + nilaiTertinggi);
        System.out.println("nilai terendah :" + nilaiTerendah);
        System.out.println("jumlah nahasiswa lulus :" + jumlLulus);
        System.out.println("jumlah mahasiswa tidak lulus :" + jumlTidakLulus);

        sc.close();

    }

}