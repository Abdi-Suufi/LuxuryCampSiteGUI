/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessmodel;

/**
 *
 * @author abdis
 */
public class GeodesicDome {
    String Woodland;

    public GeodesicDome(String Woodland, int NumberInZone, int Accommodates, int PricePerNight) {
        this.Woodland = Woodland;
        this.NumberInZone = NumberInZone;
        this.Accommodates = Accommodates;
        this.PricePerNight = PricePerNight;
    }
    int NumberInZone;
    int Accommodates;
    int PricePerNight;
}
