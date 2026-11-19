
import java.util.Scanner;

public class BioskopWithScanner04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama;
        int pilihan;

        String[][] penonton = new String[4][2];

        do {
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.print("\nMasukkan nama penonton: ");
                    nama = sc.nextLine();

                    do {
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();

                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();

                        if (baris < 1 || baris > penonton.length || kolom < 1 || (baris >= 1 && baris <= penonton.length && kolom > penonton[baris - 1].length)) {
                            System.out.println("Nomor kursi tidak tersedia!");
                        } 
                        else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah terisi! Pilih kursi lain.");
                        } 
                        else {
                            penonton[baris - 1][kolom - 1] = nama;
                            break;
                        }

                    } while (true);

                    sc.nextLine();
                    break;

                case 2:
                    for (int i = 0; i < penonton.length; i++) {

                        System.out.print("Baris " + (i + 1) + ": ");

                        for (int j = 0; j < penonton[i].length; j++) {

                            if (penonton[i][j] == null) {
                                System.out.print("Kosong\t");
                            }
                            else {
                                System.out.print(penonton[i][j] + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan menu tidak tersedia!");
            }

        } while (pilihan != 3);

        sc.close();
    }
}
