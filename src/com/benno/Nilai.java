package com.benno;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Nilai {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> nilaiArr = new ArrayList<>();

    private String namaPetugas;
    private Integer banyakMhs, nilaiMhs;

    public String getNamaPetugas() {
        return namaPetugas;
    }

    public void setNamaPetugas(String namaPetugas) {
        this.namaPetugas = namaPetugas;
    }

    public void setBanyakMhs(Integer banyakMhs) {
        this.banyakMhs = banyakMhs;
    }

    public void inputNilai(){
        for (int i = 1; i <= banyakMhs; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + " = ");
            nilaiMhs = scanner.nextInt();
            nilaiArr.add(nilaiMhs);
        }
    }

    public void tampilNilai(){
        System.out.println("\n====Hasil Nilai Mahasiswa====");
        int num = 1;
        for (int i = 0; i < nilaiArr.size(); i++){
            System.out.println("Nilai Mahasiswa ke-" + num++ + " = " + nilaiArr.get(i));
        }
    }

    public void nilaiTerbesar(){
        System.out.println("\nNilai Terbesar adalah " + Collections.max(nilaiArr));
    }

    public void nilaiTerkecil(){
        System.out.println("Nilai Terkecil adalah " + Collections.min(nilaiArr));
    }
}
