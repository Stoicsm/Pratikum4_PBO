/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author BLACK
 */
public class hasilhitung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        balok balok = new balok(2,3,5);
        System.out.println("Hasil volume balok " +balok.hitunggvolume());
        System.out.println("Hasil luas balok"+ balok.hitunggluas());
        
        Kubus Kubus = new Kubus(3);
        System.out.println("Hasil volume kubus" +Kubus.hitungvolume());
        System.out.println("Hasil luas kubus "+Kubus.hitungluas());
    }   
}