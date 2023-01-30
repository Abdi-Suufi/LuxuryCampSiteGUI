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
    private String Lakeview;
    private int NumberInZone;
    private int Accommodates;
    private int PricePerNight;
    private String CabinDescription;
    

    public Cabin(String Lakeview, int NumberInZone, int Accommodates, int PricePerNight, String CabinDescription) {
        this.Lakeview = Lakeview;
        this.NumberInZone = NumberInZone;
        this.Accommodates = Accommodates;
        this.PricePerNight = PricePerNight;
        this.CabinDescription = CabinDescription;
    }

    public Cabin() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    

    public String getCabinDescription() {
        return CabinDescription;
    }

    public void setCabinDescription(String CabinDescription) {
        this.CabinDescription = CabinDescription;
    }
    
    public String getLakeview() {
        return Lakeview;
    }

    public void setLakeview(String Lakeview) {
        this.Lakeview = Lakeview;
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
        this.Accommodates = 4;
    }

    public int getPricePerNight() {
        return PricePerNight;
    }

    public void setPricePerNight(int PricePerNight) {
        this.PricePerNight = 160;
    }
    
}
