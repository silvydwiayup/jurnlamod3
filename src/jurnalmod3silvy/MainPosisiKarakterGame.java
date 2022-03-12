/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalmod3silvy;

import java.util.Scanner;

/**
 *
 * s
 */
public class MainPosisiKarakterGame {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            PosisiKarakterGame game = new PosisiKarakterGame();
            System.out.println(game.getState());
            System.out.print("Command : ");
            String c = input.nextLine();
            game.game(c);
            System.out.println(game.getState());
            System.out.print("Command : ");
            c = input.nextLine();
            game.game(c);
            System.out.println(game.getState());
        }        
    }
}
