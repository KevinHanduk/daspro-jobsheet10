import java.util.Scanner;

public class Survei04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int JUMLAH_RESPONDEN = 10;
        final int JUMLAH_PERTANYAAN = 6;

        int[][] survei = new int[JUMLAH_RESPONDEN][JUMLAH_PERTANYAAN];
        int totalKeseluruhan = 0;

        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            System.out.println("\nResponden ke-" + (i + 1));

            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                System.out.print("Pertanyaan ke-" + (j + 1) + ": ");
                survei[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nRata-rata setiap responden:");

        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            int total = 0;

            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                total += survei[i][j];
            }

            System.out.println("Responden ke-" + (i + 1) + ": "
                    + (double) total / JUMLAH_PERTANYAAN);
        }
        System.out.println("\nRata-rata setiap pertanyaan:");

        for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
            int total = 0;

            for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
                total += survei[i][j];
            }

            System.out.println("Pertanyaan ke-" + (j + 1) + ": "
                    + (double) total / JUMLAH_RESPONDEN);
        }

        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                totalKeseluruhan += survei[i][j];
            }
        }

        double rataRata = (double) totalKeseluruhan
                / (JUMLAH_RESPONDEN * JUMLAH_PERTANYAAN);

        System.out.println("\nRata-rata keseluruhan: " + rataRata);

        sc.close();
    }
}
