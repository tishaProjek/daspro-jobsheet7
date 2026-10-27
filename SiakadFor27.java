import java.util.Scanner;

public class SiakadFor27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, nilaiTertinggi= 0, nilaiTerendah= 100;
        for (int i =1; i<= 10; i++){
            System.out.println("masukkan nilai mahasiswa ke-" +i+ ":");
            nilai = sc.nextDouble();
            if (nilai > nilaiTertinggi){
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTerendah){
                nilaiTerendah = nilai;
            }
            System.out.println("nilai teringgi :" +nilaiTertinggi);
            System.out.println("nilai teringgi :" +nilaiTerendah);

        }
    }
}