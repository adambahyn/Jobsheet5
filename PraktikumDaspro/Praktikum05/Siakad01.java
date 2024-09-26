import java.util.Scanner;

public class Siakad01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim, kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukkan nama : ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM : ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas : ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen : ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai Ujian : ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        String nilaiHuruf = "";  
        double nilaiSetara = 0;  
        String Kualifikasi = ""; 
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            nilaiSetara = 4;
            Kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            nilaiSetara = 3.5;
            Kualifikasi = "Lebih Dari Baik";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            nilaiSetara = 3;
            Kualifikasi = "Baik";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            nilaiSetara = 2.5;
            Kualifikasi = "Lebih Dari Cukup";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            nilaiSetara = 2;
            Kualifikasi = "Cukup";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            nilaiSetara = 1;
            Kualifikasi = "Kurang";
        } else if (nilaiAkhir <= 39) {
            nilaiHuruf = "E";
            nilaiSetara = 0;
            Kualifikasi = "Gagal";
        } else {
        }

        System.out.println("Mahasiswa dengan nama " + nama + "(NIM " + nim + ")" + " kelas " + kelas + " nomor absen " + absen);

        System.out.println("nilai akhir: " + nilaiAkhir);
        System.out.println("nilai akhir huruf: " + nilaiHuruf);
        System.out.println("kualifikasi: " + Kualifikasi);

    }
}
