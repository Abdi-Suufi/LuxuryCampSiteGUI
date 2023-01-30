/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessmodel;

/**
 *
 * @author abdis
 */
public class Yurt {
    String WildMeadow;
    int NumberInZone;
    int Accommodates;
    int PricePerNight;

    public Yurt(String WildMeadow, int NumberInZone, int Accommodates, int PricePerNight) {
        this.WildMeadow = WildMeadow;
        this.NumberInZone = NumberInZone;
        this.Accommodates = Accommodates;
        this.PricePerNight = PricePerNight;
    }

    public String getWildMeadow() {
        return WildMeadow;
    }

    public void setWildMeadow(String WildMeadow) {
        this.WildMeadow = WildMeadow;
    }

    public int getNumberInZone() {
        return NumberInZone;
    }

    public void setNumberInZone(int NumberInZone) {
        this.NumberInZone = 4;
    }

    public int getAccommodates() {
        return Accommodates;
    }

    public void setAccommodates(int Accommodates) {
        this.Accommodates = 2;
    }

    public int getPricePerNight() {
        return PricePerNight;
    }

    public void setPricePerNight(int PricePerNight) {
        this.PricePerNight = 110;
    }
}