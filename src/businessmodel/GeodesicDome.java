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
    int NumberInZone;
    int Accommodates;
    int PricePerNight;
    String Description;

    public GeodesicDome(String Woodland, int NumberInZone, int Accommodates, int PricePerNight, String Description) {
        this.Woodland = Woodland;
        this.NumberInZone = NumberInZone;
        this.Accommodates = Accommodates;
        this.PricePerNight = PricePerNight;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getWoodland() {
        return Woodland;
    }

    public void setWoodland(String Woodland) {
        this.Woodland = Woodland;
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
        this.PricePerNight = 120;
    }
    
}
