/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author PC-A-30
 */
public class Salam {
    String tx="Tuliskan Pesan Anda";
    
    public void tulisPesan(){
        System.out.println(this.tx);
    }
    public void tulisPesan(String txt1){
        System.out.println(txt1);
    }
    public void tulisPesan(String nim,String nama){
        System.out.println("Nim saya"+nim+"Nama saya"+nama);
    }
}
