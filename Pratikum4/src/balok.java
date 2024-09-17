/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BLACK
 */
public class balok {
    private double panjang, lebar, tinggi;
    public balok(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this. tinggi = tinggi;
    }
    public double hitunggvolume(){
        return panjang * lebar * tinggi;
    }
    public double hitunggluas(){
        return 2*(panjang*lebar+panjang*tinggi+lebar*tinggi);
    }
}
