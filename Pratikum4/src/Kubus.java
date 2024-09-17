/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BLACK
 */
public class Kubus {
    private double sisi;
    public Kubus(double sisi){
        this.sisi = sisi;
    }
    public double hitungvolume(){
        return sisi * sisi * sisi;
    }
    public double hitungluas(){
        return 6*sisi*sisi;
    }
}
