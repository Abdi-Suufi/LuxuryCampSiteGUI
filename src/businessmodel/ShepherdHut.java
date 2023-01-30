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
    int NumberInZone;
    int Accommodates;
    int PricePerNight;

    public ShepherdHut(String Hilltop, int NumberInZone, int Accommodates, int PricePerNight) {
        this.Hilltop = Hilltop;
        this.NumberInZone = NumberInZone;
        this.Accommodates = Accommodates;
        this.PricePerNight = PricePerNight;
    }

    public String getHilltop() {
        return Hilltop;
    }

    public void setHilltop(String Hilltop) {
        this.Hilltop = Hilltop;
    }

    public int getNumberInZone() {
        return NumberInZone;
    }

    public void setNumberInZone(int NumberInZone) {
        this.NumberInZone = 3;
    }

    public int getAccommodates() {
        return Accommodates;
    }

    public void setAccommodates(int Accommodates) {
        this.Accommodates = 3;
    }

    public int getPricePerNight() {
        return PricePerNight;
    }

    public void setPricePerNight(int PricePerNight) {
        this.PricePerNight = 140;
    }
    
}
