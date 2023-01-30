/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessmodel;

/**
 *
 * @author abdis
 */
public class Cabin {
    String Lakeview;

    public Cabin(String Lakeview, int NumberInZone, int Accommodates, int PricePerNight) {
        this.Lakeview = Lakeview;
        this.NumberInZone = NumberInZone;
        this.Accommodates = Accommodates;
        this.PricePerNight = PricePerNight;
    }
    int NumberInZone;
    int Accommodates;
    int PricePerNight;
}
