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
    private String GuestsColumnID;
    private boolean BreakfastColumnID;
    
    public AccomTable(int NoColumnID, String AccommTypeColumnID, String OccupancyColumnID, String AvailabilityColumnID, String StatusColumnID, String GuestsColumnID, boolean BreakfastColumnID) {
        this.NoColumnID = NoColumnID;
        this.AccommTypeColumnID = AccommTypeColumnID;
        this.OccupancyColumnID = OccupancyColumnID;
        this.AvailabilityColumnID = AvailabilityColumnID;
        this.StatusColumnID = StatusColumnID;
        this.GuestsColumnID = GuestsColumnID;
        this.BreakfastColumnID = BreakfastColumnID;
    }

    public AccomTable() {
    }

    public void setNoColumnID(int NoColumnID) {
        this.NoColumnID = NoColumnID;
    }

    public void setAccommTypeColumnID(String AccommTypeColumnID) {
        this.AccommTypeColumnID = AccommTypeColumnID;
    }

    public void setOccupancyColumnID(String OccupancyColumnID) {
        this.OccupancyColumnID = OccupancyColumnID;
    }

    public void setAvailabilityColumnID(String AvailabilityColumnID) {
        this.AvailabilityColumnID = AvailabilityColumnID;
    }

    public void setStatusColumnID(String StatusColumnID) {
        this.StatusColumnID = StatusColumnID;
    }

    public void setGuestsColumnID(String GuestsColumnID) {
        this.GuestsColumnID = GuestsColumnID;
    }

    public void setBreakfastColumnID(boolean BreakfastColumnID) {
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

    public String getGuestsColumnID() {
        return GuestsColumnID;
    }

    public boolean getBreakfastColumnID() {
        return BreakfastColumnID;
    }
}

