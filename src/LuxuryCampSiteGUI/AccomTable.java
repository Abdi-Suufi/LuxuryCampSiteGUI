/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuxuryCampSiteGUI;

/**
 *
 * @author abdis
 */
public class AccomTable {
    private int NoColumnID;
    private String AccommTypeColumnID;
    private String OccupancyColumnID;
    private String AvailabilityColumnID;
    private String StatusColumnID;
    private int GuestsColumnID;
    private String BreakfastColumnID;
    
    public AccomTable(int NoColumnID, String AccommTypeColumnID, String OccupancyColumnID, String AvailabilityColumnID, String StatusColumnID, int GuestsColumnID, String BreakfastColumnID) {
        this.NoColumnID = NoColumnID;
        this.AccommTypeColumnID = AccommTypeColumnID;
        this.OccupancyColumnID = OccupancyColumnID;
        this.AvailabilityColumnID = AvailabilityColumnID;
        this.StatusColumnID = StatusColumnID;
        this.GuestsColumnID = GuestsColumnID;
        this.BreakfastColumnID = BreakfastColumnID;
    }

    public int getNoColumnID() {
        return NoColumnID;
    }

    public String getAccommTypeColumnID() {
        return AccommTypeColumnID;
    }

    public String getOccupancyColumnID() {
        return OccupancyColumnID;
    }

    public String getAvailabilityColumnID() {
        return AvailabilityColumnID;
    }

    public String getStatusColumnID() {
        return StatusColumnID;
    }

    public int getGuestsColumnID() {
        return GuestsColumnID;
    }

    public String getBreakfastColumnID() {
        return BreakfastColumnID;
    }
}

