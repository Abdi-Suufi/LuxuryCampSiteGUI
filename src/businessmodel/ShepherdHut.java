/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessmodel;

/**
 *
 * @author abdis
 */
public class ShepherdHut {
    String Hilltop;

    public ShepherdHut(String Hilltop, int NumberInZone, int Accommodates, int PricePerNight) {
        this.Hilltop = Hilltop;
        this.NumberInZone = NumberInZone;
        this.Accommodates = Accommodates;
        this.PricePerNight = PricePerNight;
    }
    int NumberInZone;
    int Accommodates;
    int PricePerNight;
}
