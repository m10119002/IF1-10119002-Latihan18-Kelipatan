/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan18;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program kelipatan
 * 
 * 
 */
public class Kelipatan {
    
    private static void keluarProgram() {
        System.err.print("Looping tanpa henti!");
        System.exit(0);
    }
    
    public static void main(String[] args) {
        float mulai = 3.5f;
        float kelipatan = 3.5f;
        int akhir = 35;
        
        // 3.5 + 0 = 3.5 + 0 = 3.5 .. 3.5 (akhir = 35)
        if(kelipatan==0) keluarProgram();
        // 3.5 + (-3.5) = 0 + (-3.5) = -3.5 .. -9999 (akhir = 35)
        if(kelipatan < 0) keluarProgram();
        
        float i = mulai;
        while(i <= akhir) {
            System.out.println(i);
            i += kelipatan;
        }
    }
}
