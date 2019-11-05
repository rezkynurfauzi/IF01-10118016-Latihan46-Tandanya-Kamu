/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118016.latihan46.tandanya.kamu;
import java.util.Scanner;

/**
 *
 * @author Rezky
 * NAMA      : Rezky Nur Fauzi
 * KELAS     : IF-1
 * NIM       : 10118016
 * Deskripsi Program   : Program ini berisi program Tandanya Kamu
 */

public class IF0110118016Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        Kamu objKamu = new Kamu(2019);
        System.out.print("Masukan tahun Lahir Anda : ");
        objKamu.setYearBirth(scan.nextInt());
        System.out.println("");
        
        System.out.println("====Hasil Perhitungan Umur====");
        System.out.println("Tahun Lahir Anda "+objKamu.getYearBirth());
        System.out.println("Hari ini Tahun : "+objKamu.getYearNow());
        System.out.println("Umur kamu sampai saat ini adalah "+objKamu.hitungUmur
        ()+" tahun ");
        System.out.println("Tandanya Kamu "+objKamu.tandanyaKamu(objKamu.hitungUmur()));
    }
    
}
