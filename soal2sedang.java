package rillUKL;

import java.util.Scanner;

public class soal2sedang {
    public static void main(String[] args) {
        System.out.println("===Menghitung luas permukaan bola===");
        Scanner s = new Scanner(System.in);
        int jari=0, tinggi=0;
        System.out.println("Masukkan jari jari = ");
        jari = s.nextInt();
        System.out.println("Masukkan tinggi = ");
        tinggi = s.nextInt();
        System.out.println("4 * 3.14 " + "* " + jari);
        volume(jari);
        tabung(jari,tinggi);
    }
    public static void volume(int jari){
        System.out.println("Luas permukaan bola adalah = " + (4*3.14*jari*jari));
    }
    public static void tabung(int jari, int tinggi){
        System.out.println("Volume tabung adalah = " + (3.14 * jari * jari * tinggi));
    }
    }

