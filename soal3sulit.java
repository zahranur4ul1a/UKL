package rillUKL;

import java.util.Scanner;

public class soal3sulit {

    public static void main(String[] args) {
        int[] array;

        System.out.println("===Mencari elemen yang paling sering muncul dalam Array==="); 
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan jumlah elemen array: ");
        int jumlah = s.nextInt();
        array = new int[jumlah];
        for (int j = 0; j < array.length; j++) {
            System.out.println("Masukkan elemen ke-" + (j + 1) + ": ");
            array[j] = s.nextInt();
        }

        cekSeringMuncul(array);
    }

    public static void cekSeringMuncul(int[] array) {
        int maxFrek = 0;
        int indks = 0;
        System.out.println("Elemen Array yang paling sering muncul:");
        boolean adaDuplikat = false;

        for (int i = 0; i < array.length; i++) { 
            int frekuensi = 0;
            boolean sudahDihitung = false;
            for (int j = 0; j < array.length; j++) { 
                if (array[i] == array[j]) {
                    frekuensi++;
                }
            }

            if (frekuensi > maxFrek) {
                maxFrek = frekuensi;
                indks = i;
                adaDuplikat = true;
            }

        }

        if (adaDuplikat) {
            System.out.println("Elemen yang paling sering muncul dalam Array tersebut adalah " + array[indks] + " sebanyak " + maxFrek + " kali");
        }

        if (!adaDuplikat) {
            System.out.println("Tidak ada elemen yang sering muncul");
        }
    }
}

