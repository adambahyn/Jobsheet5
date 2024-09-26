import java.util.Scanner;

public class KategoriUsia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int usia;

        System.out.print("Masukkan usia Anda: ");
            usia = scanner.nextInt();

                if (usia >= 0) {
                String kategoriUsia;
                if (usia <= 12) {
                    kategoriUsia = "Anak";
                } else if (usia <= 19) {
                    kategoriUsia = "Remaja";
                } else if (usia <= 64) {
                    kategoriUsia = "Dewasa";
                } else {
                    kategoriUsia = "Lansia";
                }

                System.out.println("Kategori usia Anda: " + kategoriUsia);
            } else {
                System.out.println("Input tidak valid. Usia harus angka positif.");
            }
        }
    }
