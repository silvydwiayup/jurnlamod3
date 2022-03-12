/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalmod3silvy;

import java.util.Scanner;

/**
 *
 * @author fachrur fatanillah
 */
public class MainKodeBuah {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan Nama Buah : ");
            String kl = input.nextLine();
            System.out.println(KodeBuah.getKodePos(kl));
        }
    }
}