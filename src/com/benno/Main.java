package com.benno;
import java.util.Scanner;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Menemukan Nilai terbesar dan terkecil
     */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Nilai nilai = new Nilai();

        System.out.println("====Program Nilai Terbesar dan Terkecil Mahasiswa====");
        System.out.print("Masukkan Nama Petugas : ");
        nilai.setNamaPetugas(scanner.nextLine());
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        nilai.setBanyakMhs(scanner.nextInt());

        nilai.inputNilai();
        nilai.tampilNilai();
        nilai.nilaiTerbesar();
        nilai.nilaiTerkecil();

        System.out.println("\nPetugas : " + nilai.getNamaPetugas());
    }
}
