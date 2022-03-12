/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalmod3silvy;

/**
 *
 * 
 */
public class KodeBuah {
     private static String checkName(String name){
        switch (name) {
            case "apel":
                return "A00";
            case "aprikot":
                return "B00";
            case "alpukat":
                return "C00";
            case "pisang":
                return "D00";
            case "paprika":
                return "E00";
            case "blackberry":
                return "F00";
            case "ceri":
                return "H00";
            case "kelapa":
                return "I00";
            case "jagung":
                return "J00";
            case "kurma":
                return "K00";
            case "durian":
                return "L00";
            case "anggur":
                return "M00";
            case "melon":
                return "N00";
            case "semangka":
                return "O00";
                
            default:
                return "NULL";
        }
    }
    public static String getKodePos(String kelurahan) {
        kelurahan = kelurahan.toLowerCase();
        return checkName(kelurahan);
    }
}
