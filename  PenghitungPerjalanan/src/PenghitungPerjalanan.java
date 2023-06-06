import java.util.Scanner;

public class PenghitungPerjalanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak tempuh (dalam kilometer): ");
        double jarak = input.nextDouble();

        double tarif = 0;
        double potonganWaktu = 0;

        if (jarak < 50) {
            System.out.println("Jarak kurang dari 50 km. Tidak ada tarif jalan yang dikenakan.");
        } else if (jarak >= 50 && jarak < 80) {
            tarif = 100000;
            potonganWaktu = 0.3;
        } else if (jarak >= 80 && jarak < 150) {
            tarif = 135000;
            potonganWaktu = 0.35;
        } else if (jarak >= 150) {
            tarif = 230000;
            potonganWaktu = 0.4;
        }

        double waktu = hitungWaktu(jarak, potonganWaktu);
        double kecepatan = hitungKecepatan(jarak, waktu);

        System.out.println("Tarif Jalan Tol: Rp " + tarif);
        System.out.println("Waktu Perjalanan: " + waktu + " jam");
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }

    public static double hitungWaktu(double jarak, double potonganWaktu) {
        double waktu = jarak / (1 - potonganWaktu);
        return waktu;
    }

    public static double hitungKecepatan(double jarak, double waktu) {
        double kecepatan = jarak / waktu;
        return kecepatan;
    }
}