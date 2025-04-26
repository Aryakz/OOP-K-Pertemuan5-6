/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan0506;

/**
 *
 * @author Nyoman Arya Wiyaksana
 * TGL : 26-04-2025
 */
public class Pertemuan0506 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        manusia johan = new manusia("L");
        johan.warnakulit="brown";
        johan.SetWarnaRambut("hitam");
        
        manusia yani = new manusia("P");
        yani.warnakulit="hitam";
        yani.SetWarnaRambut("hitam");
    }
    
}

class manusia{
    public String warnakulit="";
    private String warnarambut="";
    private String jeniskelamin="";
    
    public manusia(String jkel){
        this.jeniskelamin = jkel;
    }
    
    public void SetWarnaRambut(String warna){
        this.warnarambut = warna;
    }
}